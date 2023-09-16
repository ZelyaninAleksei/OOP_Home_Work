package Controllers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccauntController {

    public static <T extends Teacher> void paySalary(T person, int salsary) {
        System.out.println(person.getName() + " выплачено зарплата " + salsary + " руб.");
    };

    /**
     * 
     * @param <T>    дЖенерик для класса Person
     * @param person список в котором находим средний возраст
     * @return возвращаем средний возраст по списку
     */
    public static <T extends Person> double averageAge(List<T> person) {
        double sum = 0;
        for (T pers : person) {
            sum += pers.getAge();
        }
        return sum / person.size();

    }
}
