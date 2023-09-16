package Domen;

import java.util.Iterator;
import java.util.List;

// Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) 
// и отсортировать группы студентов в потоке, а затем вывести в консоль

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;
    private int numberOfStudents;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }


     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
        
    }

    /**
     * 
     * @param group список студентов группы
     * @return размер группы (количество студентов)
     */
    public int sizeGroup(List<Student> group) {
        return group.size();
    }

    /**
     * сравнение по количеству студентов
     */
    @Override
    public int compareTo(StudentGroup otherGroup) {

        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);

    }
   
    
}