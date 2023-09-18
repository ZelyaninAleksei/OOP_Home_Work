import java.util.ArrayList;
import java.util.List;

import Controller.*;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.ModelClassHash;
import Model.Core.Student;
import View.ViewClassEng;


public class App {
    public static void main(String[] args) throws Exception {
        
        /**
         * Создание списка студентов
         */
        List<Student> students = new ArrayList<>();

        /**
         * создание студентов
         */
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Ваня", 25);
        Student s3 = new Student("Даша", 24);
        Student s4 = new Student("Света", 21);
        Student s5 = new Student("Игроь", 21);
        Student s6 = new Student("Петя", 22);
        Student s7 = new Student("Мария", 23);

        /**
         * добавление в список студентов
         */
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        /**
         * Создание экземляра класса ModelClassHash
         */

        ModelClassHash model = new ModelClassHash();

        /**
         * добавление в model студентов
         */
         
         for (Student student : students) {
            model.addStudent(student);
        }
        
        /**
         * создание экземпляра класса ModelClassFile
         */
        ModelClassFile fModel = new ModelClassFile("StudentDB.csv");

      
        /**
         * Добавление списка студентов  в файл StudentDB.csv
         */
        fModel.saveAllStudentToFile(students);
        iGetModel modelList = fModel;
        iGetView view = new ViewClassEng();



        ControllerLang controller = new ControllerLang(view, modelList);
        
        /**
         * вызов метода run для выбора языка
         */
        controller.run();
    }
}
