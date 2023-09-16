package Domen;

import java.util.*;

// 1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
// 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на консоль
// 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) 
// и отсортировать группы студентов в потоке, а затем вывести в консоль

// (задача со *)
// 1) Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
// 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор группы,
//  количество студентов и список студентов) и StudentSteam(выводить номер потока, количество групп и список студентов 
// с указанием идентификатора группы)



public class StudentStream implements Iterable<StudentGroup> {

    /**
     * streamNumber - массив групп вхолдящих в поток
     */
    public ArrayList<StudentGroup> streamGroup;
    
    /**
     * number - номер потока;
     */
    public int number;

    /**
     * 
     * @param number - номер потока;
     */
    public StudentStream(int number) {
        this.number = number;
        this.streamGroup = new ArrayList<>();
    }

   
    /**
     * Добавление группы в поток
     * @param studGroup группа студентов
     */
    public void streamAdd(StudentGroup studGroup) {
        streamGroup.add(studGroup);
    }


    /**
     * 
     * @return возвращает группу
     */
    public ArrayList<StudentGroup> getStreamGroup() {
        return streamGroup;
    }

    /**
     * 
     * @param streamGroup массив групп
     */
    public void setStreamGroup(ArrayList<StudentGroup> streamGroup) {
        this.streamGroup = streamGroup;
    }

    /**
     * Возвращает итератор для streamGroup;
     */
    public Iterator<StudentGroup> iterator() {
        return streamGroup.iterator();
    }

}



