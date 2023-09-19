package Task3;

import Task3.interfaces.Shape;

/**
 * класс круг реализовывает интрефейс фигура
 */
public class Circle implements Shape {
    private double radius;

    /**
     * Конструктор класса
     * 
     * @param radius - радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * реализация интерфейса Shape
     */
    public double area() {
        double res = 2 * 3.14 * radius;
        return res;
    }
}
