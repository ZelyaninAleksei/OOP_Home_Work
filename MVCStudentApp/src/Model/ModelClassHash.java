package Model;

import java.util.*;
import Controller.Interfaces.iGetModel;
import Model.Core.Student;

/**
 * класс для хранения информации о студентах с использованием HashMap
 */
public class ModelClassHash implements iGetModel{
    private Map<Long, Student> studentMap;
    long id;

    /**
     * конструкттор класса
     */
    public ModelClassHash()
    {
        this.studentMap= new HashMap<>();
    }

    /**
     * метод для добавления студента
     */

     public void addStudent(Student student) {
        Integer studentId = student.getId();
        long idStudent = studentId.longValue(); // преобразование Intenger ID в long ID
        studentMap.put(idStudent, student);
    }

    //метод удаления студента
    public void deleteStudent(Long id)
    {
        studentMap.remove(id);
    }


    /**
     * возвращает список студентов
     */
    @Override
    public List<Student> getStudents() {
       List<Student> studentList = new ArrayList<>(studentMap.values());
        return studentList;
    }

    @Override
    public void deleteStudent(long id) {
        studentMap.remove(id);
        System.out.println("Студент с ID " + id + " удалён успешно");
    }
}
