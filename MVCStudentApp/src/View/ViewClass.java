package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.ModelClassHash;
import Model.Core.Student;

public class ViewClass implements iGetView{

    /**
     * метод печати списка студентов
     * @param students список студентов
     */
    
    public void printAllStudent(List<Student> students)
    {
        System.out.println(" \n________ Список студентов ________");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
    }

    public String prompt(String message)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();

    }

    public Long deleteStudent()
    {
        String id = prompt("Введите ID студента");
        long idDelete = Long.parseLong(id);
        return idDelete;  
    }
}
