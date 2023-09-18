package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс View на английском языке
 */

public class ViewClassEng implements iGetView{

    /**
     * метод печати списка студентов
     * @param students список студентов
     */
    
    public void printAllStudent(List<Student> students)
    {
        System.out.println(" \n________ List students ________");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
    }

    /**
     * метод для ввода
     */
    public String prompt(String message)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();

    }

    /**
     * Метод добавления студента
     * @param id - целое число индитификатор студента
     * @param student- студент
     */
    public void addSudents(Integer id, Student student)
    {

    }

    /**
     * 
     * @param id идентификатор студента для удаления
     */
    public Long deleteStudent()
    {
        String id = prompt("Введите ID студента");
        long idDelete = Long.parseLong(id);
        return idDelete;  
    }
}
