import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccauntController;
import Domen.*;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
       Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Вадим", 22);
        Student s4 = new Student("Мая",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        Student s7 = new Student("Петя", 25);
        Student s8 = new Student("Дима", 23);
        Student s9 = new Student("Вова", 22);
        Student s10 = new Student("Боря",  23);
  


        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group4115 = new StudentGroup(listStud2, 4115);

        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55  ,  "docent");
        Teacher t2 = new Teacher("Татьяна", 59  , "docent");

        System.out.println(new PersonComparator<Student>().compare(s1, s2));
        // System.out.println(new PersonComparator<Teacher>().compare(t1, t2));


        // AccauntController controller = new AccauntController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(t2, 50000);

        AccauntController.paySalary(t1, 50000);
     
        System.out.println(new PersonComparator<Teacher>().compare(t1,t2));

        System.out.println("Средний возраст = " + AccauntController.averageAge(listStud));
    }
}