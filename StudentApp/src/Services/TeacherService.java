package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

/**
 * сервис для работы с преподавателями
 */

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>(null);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Создать преподователя
     */
    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, name);
        count++;
        teachers.add(teach);
    }

    /**
     * сортировка списка преодователей
     */
    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }

}
