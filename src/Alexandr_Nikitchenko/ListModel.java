package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Александр on 14.02.2017.
 */
public class ListModel extends BuyButton implements ItemListener {

    BuyButton list;
    ImageIcon Q7, X5, R4;

    ListModel(BuyButton list){
        super();
        this.list = list;
    }

    @Override
    public void itemStateChanged(ItemEvent parent) {

            // Добавляем фото автомобилей
            Q7 = (new ImageIcon(getClass().getResource("Q7.png")));
            X5 = (new ImageIcon(getClass().getResource("X5.png")));
            R4 = (new ImageIcon(getClass().getResource("R4.png")));

            //  Выбор списка автомобилей
            list.parent.auto = (JComboBox) parent.getSource();

            if (list.parent.auto.getSelectedIndex() == 0){
                list.parent.label.setText(null);
                list.parent.image.setIcon(null);
                list.parent.information.setText(null);

            }else if (list.parent.auto.getSelectedIndex() == 1) {
                list.parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля AUDI Q7:<ul>" +
                        "<li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)<li>Положение руля - слева" +
                        "<li>Объем двигателя в куб.см. - 2967" +
                        "<li>Тип привода - постоянный на все колеса<li>Тип КПП - автомат 8 ступеней" +
                        "<li>Цена: " + price + " тенге");
                list.parent.display.setText(null);
                list.parent.image.setIcon(Q7);
                list.parent.information.setText(null);

            } else if (list.parent.auto.getSelectedIndex() == 2) {
                list.parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля BMV X5:<ul>" +
                        "<li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)<li>Положение руля - слева" +
                        "<li>Объем двигателя в куб.см. - 2993" +
                        "<li>Тип привода - постоянный на все колеса" +
                        "<li>Тип КПП - автомат 8 ступеней" +
                        "<li>Цена: " + price1 + " тенге");
                list.parent.display.setText(null);
                list.parent.image.setIcon(X5);
                list.parent.information.setText(null);

            } else if (list.parent.auto.getSelectedIndex() == 3) {
                list.parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля AUDI Q7:<ul>" +
                        "<li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)" +
                        "<li>Положение руля - слева<li>Объем двигателя в куб.см. - 1987" +
                        "<li>Тип привода - передний с подключаемым задом" +
                        "<li>Тип КПП - механика 6 ступеней, автомат CVT (вариатор)" +
                        "<li>Цена: " + price2 + " тенге");
                list.parent.display.setText(null);
                list.parent.image.setIcon(R4);
                list.parent.information.setText(null);

            }
        }
    }

