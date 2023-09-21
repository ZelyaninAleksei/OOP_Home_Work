package Controller;

import java.util.Scanner;

import Controller.interfaces.iUserEntering;

public class MenuClass implements iUserEntering{
    
        /**
     * метод ввода пользователем данных
     * 
     * @param message - сообщение для запроса ввода
     * @return - возвращает данные пользователем в формате Intenger
     */
    public double prompt(String message) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println(message);
            Integer result = in.nextInt();
            return result;
        } catch (Exception e) {
            System.out.println("Error input");
        }
        return 0;
    }

    /**
     * метод вывода меню
     * @return возвращает номер выбранного пункта
     */
    public Integer Menu() {
        System.out.println("Menu");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Integer choice = (int) prompt("Введите пункт меню:");

        return choice;
    }
}
