package Task1;

import java.util.Date;

//Класс работник

public class Employee {
    /**
     * определение свойств класса
     * name - имя работника
     * dob - дата рождения
     */

    private String name;
    private Date dob;

    /**
     * 
     * @param name имя работника
     * @param dob  дата рождение
     */

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    /**
     * Метод для получения информации о работнике
     * 
     * @return возвращает имя и дату рождения
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}