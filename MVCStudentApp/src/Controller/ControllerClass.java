package Controller;


import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод проверки списка студентов
     * @param studs список студентов
     * @return возвращает результат проверки
     */
    private boolean testData(List<Student> studs) 
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void update()
    {
        //MVP
        students = model.getStudents();

        if (testData(students))
        {
            view.printAllStudent(students);
        }
        else
        {
            System.out.println("\n_______________________");
            System.out.println("Список студентов пустой");
            System.out.println("-------------------------");
        }

        //MVC
        // view.printAllStudent(model.getStudents());
    }

    public void runSecond() 
    {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {

            String command = view.prompt("Введите команду");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    view.deleteStudent();
                

            }
        }
    }
}
