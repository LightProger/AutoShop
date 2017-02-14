package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Александр on 14.02.2017.
 */
public class ListModel implements ItemListener {

    AutoShop parent;
    ImageIcon Q7, X5, R4;

    ListModel(AutoShop parent){
        this.parent = parent;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

            // Добавляем фото автомобилей
            Q7 = (new ImageIcon(getClass().getResource("Q7.png")));
            X5 = (new ImageIcon(getClass().getResource("X5.png")));
            R4 = (new ImageIcon(getClass().getResource("R4.png")));

            //  Выбор списка автомобилей
            parent.auto = (JComboBox) e.getSource();

            if (parent.auto.getSelectedIndex() == 1) {
                parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля AUDI Q7:<ul><li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)<li>Положение руля - слева<li>Объем двигателя в куб.см. - 2967" +
                        "<li>Тип привода - постоянный на все колеса<li>Тип КПП - автомат 8 ступеней</html>");
                parent.display.setText(null);
                parent.image.setIcon(Q7);
                parent.information.setText(null);

            } else if (parent.auto.getSelectedIndex() == 2) {
                parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля BMV X5:<ul><li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)<li>Положение руля - слева<li>Объем двигателя в куб.см. - 2993" +
                        "<li>Тип привода - постоянный на все колеса<li>Тип КПП - автомат 8 ступеней</html>");
                parent.display.setText(null);
                parent.image.setIcon(X5);
                parent.information.setText(null);

            } else if (parent.auto.getSelectedIndex() == 3) {
                parent.label.setText("<html><p>&nbsp;&nbsp;&nbsp;&nbsp;Описание автомобиля AUDI Q7:<ul><li>Тип кузова - внедорожник<li>Количество дверей - 5" +
                        "<li>Класс автомобиля - J (кроссовер)<li>Положение руля - слева<li>Объем двигателя в куб.см. - 1987" +
                        "<li>Тип привода - передний с подключаемым задом<li>Тип КПП - механика 6 ступеней, автомат CVT (вариатор)</html>");
                parent.display.setText(null);
                parent.image.setIcon(R4);
                parent.information.setText(null);

            }
        }
    }

