package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Александр on 14.02.2017.
 */
public class BuyButton extends Exception implements ActionListener {
    AutoShop parent;
    double displayValue = 0;
    int result = 0;
    int price = 40_520_750, price1 = 21_000_000, price2 = 10_550_000;
    int sum, sum1, sum2;

    BuyButton(AutoShop parent){
        this.parent = parent;
        // Передача функций в класс ListModel
        ListModel listModel = new ListModel(this);
        parent.auto.addItemListener(listModel);
    }

    public BuyButton() {

    }

    @Override
    public void actionPerformed(ActionEvent e)  {

        // Создание объекта-кнопки
        Object button = e.getSource();

        //Обработчик ошибок
        try {
            // Получить число из дисплея,
            // если он не пустой.
            // Восклицательный знак – это оператор отрицания
            String dispFieldText = parent.display.getText();
            if (!"".equals(dispFieldText)) {
                displayValue = Double.parseDouble(dispFieldText);
            }

            // Если не выбрана модель автомобиля и количество и нажата кнопка "Купить", выдать сообщение
            if ((parent.auto.getSelectedIndex() == 0) && (button == parent.buybutton)) {
                parent.information.setText("Ошибка оформления заказа!");
                JOptionPane.showMessageDialog(null, "Выберите модель автомобиля...",
                        "Сообщение об ошибке", JOptionPane.ERROR_MESSAGE);
            }
            // Если значение поля ввода, меньше или равно нолю, выдать сообщение об ошибке
             if ((displayValue <= 0) && (button == parent.buybutton)) {
                parent.display.setText(null);
                parent.information.setText("Ошибка оформления заказа!");
                displayValue = 0;
                JOptionPane.showMessageDialog(null, "Введите количество...",
                        "Сообщение об ошибке", JOptionPane.ERROR_MESSAGE);
            }

            // Действия при нажатии кнопки "Купить"
             else if (button == parent.buybutton && parent.auto.getSelectedIndex() == 1) {
                result = (int) displayValue;
                sum = result * price;
                displayValue = 0;
                parent.information.setText("<html><p>Ваш заказ оформлен! Вы приобрели автомобиль AUDI Q7 - " + " "
                        + result + " шт. <p>Общая сумма заказа: "  + sum + " тенге");

            } else if (button == parent.buybutton && parent.auto.getSelectedIndex() == 2) {
                result = (int) displayValue;
                sum1 = result * price1;
                displayValue = 0;
                parent.information.setText("<html><p>Ваш заказ оформлен! Вы приобрели автомобиль BMV X5 - " + " " + result +
                        " шт. <p>Общая сумма заказа: "  + sum1 + " тенге");

            } else if (button == parent.buybutton && parent.auto.getSelectedIndex() == 3) {
                result = (int) displayValue;
                sum2 = result * price2;
                displayValue = 0;
                parent.information.setText("<html><p>Ваш заказ оформлен! Вы приобрели автомобиль TOYOTA RAV4 - " + " " + result +
                        " шт. <p>Общая сумма заказа: " + sum2 + " тенге");

            }

            // Если выбрано больше 3 автомобилей, написать, что столько автомобилей нет в наличии и все обнулить.
            if (result > 3) try {
                throw ( new Exception ("Сообщение"));
            } catch (Exception e1) {
                parent.display.setText(null);
                parent.information.setText("Ошибка оформления заказа!");
                JOptionPane.showMessageDialog(null, "Столько автомобилей, нет в наличии!",
                        "Сообщение об ошибке", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e1) {
            // При возникновении ошибок, все обнулить и выдать сообщение
            parent.display.setText(null);
            parent.information.setText("Ошибка оформления заказа!");
            displayValue = 0;
            JOptionPane.showMessageDialog(null, "Ошибка! Введите количество!",
                    "Сообщение об ошибке", JOptionPane.ERROR_MESSAGE);
        }
    }
}
