package Task1;

import Task1.Interfaces.calculateNet;

/**
 * класс Accounting (Бухгалтерия)
 */

public class Accounting implements calculateNet {

    /**
     * baseSalary - базовая зарплата (например оклад);
     */
    int baseSalary;

    /**
     * реализация интерфейса calculateNet
     * 
     * @return возращает "чистую" выплату, т.е. оклад минус налог
     */
    @Override
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }

}
