package Model;

import java.util.*;

import Controller.Interfaces.iGetModel;
import Model.Core.*;

public class ModelClassList implements iGetModel {

    /**
     * students - список (List) студентов
     */
    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    /**
     * 
     * @return возвращает студентов
     */
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void deleteStudent(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }


    
}
