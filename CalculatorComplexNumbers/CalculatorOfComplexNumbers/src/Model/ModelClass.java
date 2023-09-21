package Model;

import Controller.interfaces.iCalculation;

public class ModelClass implements iCalculation {

    @Override
    public void addition(ComplexNumber cn1, ComplexNumber cn2) {
        System.out.printf("Первое число: \n" + cn1.toString());
        System.out.printf("\nВторое число: \n" + cn2.toString());
        ComplexNumber resultNum = new ComplexNumber(cn1.getResNumber() + cn2.getResNumber(),
                cn1.getImNumber() + cn2.getImNumber());
        System.out.println("\n Результат сложения:" + resultNum.toString());
    }

    @Override
    public void subtraction(ComplexNumber cn1, ComplexNumber cn2) {
        System.out.printf("Первое число: \n" + cn1.toString());
        System.out.printf("\nВторое число: \n" + cn2.toString());
        ComplexNumber resultNum = new ComplexNumber(cn1.getResNumber() - cn2.getResNumber(),
                cn1.getImNumber() - cn2.getImNumber());
        System.out.println("\n Результат вычитания:" + resultNum.toString());
    }

    @Override
    public void multiplication(ComplexNumber cn1, ComplexNumber cn2) {
        System.out.printf("Первое число: \n" + cn1.toString());
        System.out.printf("\nВторое число: \n" + cn2.toString());
        double mulRes = (cn1.getResNumber() * cn2.getResNumber() - cn1.getImNumber() * cn2.getImNumber())
                / (cn1.getResNumber() * cn1.getResNumber() + cn2.getImNumber() * cn2.getImNumber());
        double mulIm = (cn1.getImNumber() * cn2.getResNumber() + cn1.getResNumber() * cn2.getImNumber())
                / (cn1.getResNumber() * cn1.getResNumber() + cn2.getImNumber() * cn2.getImNumber());
        ComplexNumber resultNum = new ComplexNumber(mulRes, mulIm);

        System.out.println("\n Результат умножения: \n" + resultNum.toString());
    }

    @Override
    public void division(ComplexNumber cn1, ComplexNumber cn2) {
        System.out.printf("Первое число: \n" + cn1.toString());
        System.out.printf("\nВторое число: \n" + cn2.toString());
        double mulRes = ((cn1.getResNumber() * cn2.getResNumber()
                + +cn1.getImNumber() * cn2.getImNumber() / cn2.getResNumber() * cn2.getResNumber()
                + cn2.getImNumber() * cn2.getImNumber()));
        double mulIm = ((cn1.getImNumber() * cn2.getResNumber() - cn1.getResNumber() * cn2.getImNumber())
                / cn2.getResNumber() * cn2.getResNumber() + cn2.getImNumber() * cn2.getImNumber());
        ComplexNumber resultNum = new ComplexNumber(mulRes, mulIm);

        System.out.println("\nРезультат деления: \n" + resultNum.toString());
    }

    // операции над двумя комплексными числами
    public void OperationNumComplex(Integer choice, ComplexNumber cn1, ComplexNumber cn2) {
        switch (choice) {
            case 1:
                addition(cn1, cn2);
                break;
            case 2:
                subtraction(cn1, cn2);
                break;
            case 3:
                multiplication(cn1, cn2);
                break;
            case 4:
                division(cn1, cn2);
                break;
        }
    }
}
