package Services;

import java.util.*;

import Domen.*;

public class StudentService implements iPersonService<Student>{
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>(null);
    }

    @Override
    public List<Student> getAll() {
    return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }

    public void sortByFIO() 
    {
        PersonComparator<Student> persComp = new PersonComparator<Student>();
        students.sort(persComp);
    }
    
    
}
