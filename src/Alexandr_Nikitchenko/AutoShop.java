package Alexandr_Nikitchenko;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class AutoShop extends JFrame {

    JComboBox auto;
    JLabel autoModel, the_number, label, image, information;
    JTextField display;
    JButton baybuttton;
    JPanel content, submit, content2;

    public static void main(String[] args) {
        new AutoShop();

    }

    AutoShop()  {
        super("Автомагазин");

        //Задаем размер окна
        setSize(560, 380);

        // Реакция окна на закрытие
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Запрет на изменение размера окна
        setResizable(false);

        // Устанавливаем окно по центру экрана
        setLocationRelativeTo(null);

        // Создаем панель для размещения контента
        content = new JPanel(new GridLayout(1, 5, 5, 5));
        content.setBorder(new EmptyBorder(10,10,10,10));

        // Текстовое поле "Выбор модели"
        autoModel = new JLabel("Выберите модель:", SwingConstants.CENTER);
        content.add(autoModel);

        // Создаем и добавляем выпадающий список моделей
        String[] items = new String[]{
                " ",
                "AUDI Q7",
                "BMV X5",
                "TOYOTA RAV4"
        };
        auto = new JComboBox(items);
        auto.setSelectedIndex(0);
        content.add(auto);

        // Поле выбора количества
        the_number = new JLabel(" Введите количество: ", SwingConstants.CENTER);
        content.add(the_number);

        // Дисплей ввода количества

        display = new JTextField();
        content.add(display);

        // Создаем панель под кнопку
        submit = new JPanel(new GridLayout(2, 1, 5, 5));
        submit.setBorder(new EmptyBorder(10,10,10,10));

        // Создаем и добавляем поле информации
        information = new JLabel(" ", SwingConstants.CENTER);
        submit.add(information);

        // оздаем и добавляем кнопку "Разместить заказ"
        baybuttton = new JButton("Разместить заказ");
        Font buttonFont = new Font(Font.MONOSPACED, Font.BOLD, 20);
        baybuttton.setFont(buttonFont);
        submit.add(baybuttton);

        // Панель с описанием авто
        content2 = new JPanel(new GridLayout(1, 2, 5, 5));
        content2.setBorder(new EmptyBorder(10,10,10,10));
        label = new JLabel("", SwingConstants.CENTER);
        content2.add(label);

        // Поле с фотографиями
        image = new JLabel("", SwingConstants.CENTER);
        content2.add(image);

        // Добавляем панель в окно
        this.add(content, "North");
        this.add(content2, "Center");
        this.add(submit, "South");

        // Делаем окно видимым
        setVisible(true);

        // Передача функций в класс ListModel
        ListModel listModel = new ListModel(this);
        auto.addItemListener(listModel);

        // Передача функций в класс BuyButton
        BuyButton buybutton = new BuyButton(this);
        baybuttton.addActionListener(buybutton);
    }
}

