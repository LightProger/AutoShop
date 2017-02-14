package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 14.02.2017.
 */
public class BuyButton implements ActionListener{
    AutoShop parent1;
    double displayValue = 0;
    int result = 0;
    BuyButton(AutoShop parent1){
        this.parent1 = parent1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        //Обработчик ошибок
        try {
            // Получить число из дисплея,
            // если он не пустой.
            // Восклицательный знак – это оператор отрицания
            String dispFieldText = parent1.display.getText();
        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }

        // Создание объекта-кнопки
        Object button = e.getSource();

        // Если не выбрана модель автомобиля и количество и нажата кнопка "Купить", выдать сообщение
        if((parent1.auto.getSelectedIndex() == 0) && (button == parent1.baybuttton)){
            parent1.information.setText(null);
            JOptionPane.showMessageDialog(null, "Выберите модель автомобиля...");
        }else if((displayValue <= 0) && (button == parent1.baybuttton)){
            parent1.information.setText(null);
            JOptionPane.showMessageDialog(null, "Введите количество...");

        }

             // Действия при нажатии кнопки "Купить"
            else if (button == parent1.baybuttton && parent1.auto.getSelectedIndex() == 1) {
                result = (int)displayValue;
                parent1.information.setText("Ваш заказ оформлен! Вы приобрели автомобиль AUDI Q7 - " + " " + result + " шт.");
                displayValue = 0;
            } else if (button == parent1.baybuttton && parent1.auto.getSelectedIndex() == 2) {
                result = (int)displayValue;
                parent1.information.setText("Ваш заказ оформлен! Вы приобрели автомобиль BMV X5 - " + " " + result + " шт.");
                displayValue = 0;
            } else if (button == parent1.baybuttton && parent1.auto.getSelectedIndex() == 3) {
                result = (int)displayValue;
                parent1.information.setText("Ваш заказ оформлен! Вы приобрели автомобиль TOYOTA RAV4 - " + " " + result + " шт.");
                displayValue = 0;
            }
        }catch (Exception e1){
            // При возникновении ошибок, все обнулить и выдать сообщение
            parent1.display.setText(null);
            JOptionPane.showMessageDialog(null, "Ошибка! Введите количество!");
        }
    }
}
