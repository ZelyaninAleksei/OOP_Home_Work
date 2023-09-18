package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    String deleteStudent = null;
    public List<Student> getStudents();
    public void deleteStudent(long id);
}
