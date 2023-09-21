package Model;

import Controller.MenuClass;

//Класс чисел
public class ComplexNumber {
    double resNumber;
    double imNumber;

    /**
     *  
     * @param resNumber - действительная часть числа
     * @param imNumber - мнимая часть числа
     */

    public ComplexNumber(double resNumber, double imNumber) {
        this.resNumber = resNumber;
        this.imNumber = imNumber;
    }

    /**
     * 
     * @return - возращает дейтсвительную часть числа
     */
    public double getResNumber() {
        return resNumber;
    }


    /**
     * 
     * @return - возращает мнимую часть числа
     */
    public double getImNumber() {
        return imNumber;
    }

    /**
     * переопределение метода toString
     */
    @Override
    public String toString() {
        return "ComplexNumber [resNumber=" + resNumber + ", imNumber=" + imNumber + "i]";
    }

        // метод ввода комплексного числа
    public static ComplexNumber inputNumber(MenuClass menu) {
        double resNum = menu.prompt("Введите действительную часть числа:");
        double imNumber = menu.prompt("Введите мнимую часть числа");
        return new ComplexNumber(resNum, imNumber);
}
}
