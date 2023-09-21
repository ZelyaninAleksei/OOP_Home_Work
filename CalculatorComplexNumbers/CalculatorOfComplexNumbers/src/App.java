import java.awt.image.CropImageFilter;

import Controller.MenuClass;
import Model.ComplexNumber;
import Model.ModelClass;

public class App {
    public static void main(String[] args) throws Exception {

        //Создание объекта меню
        MenuClass startMenu = new MenuClass();

        //вызов метода стартменю
        Integer choice = startMenu.Menu();

        //создание объектов Комплексных чисел
        ComplexNumber cn1 = ComplexNumber.inputNumber(startMenu);
        ComplexNumber cn2 = ComplexNumber.inputNumber(startMenu);

        ModelClass mc = new ModelClass();
        mc.OperationNumComplex(choice, cn1, cn2);




    }
}
