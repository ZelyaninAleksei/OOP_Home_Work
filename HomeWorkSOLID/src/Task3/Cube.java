package Task3;

import Task3.interfaces.Shape;
import Task3.interfaces.Volume;

public class Cube implements Shape, Volume {
    private int edge;

    /**
     * Конструктор класса Куб
     * 
     * @param edge - ребро
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * реализация интрефейса Volume
     * подсчет объема куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }

    /**
     * реализация интрефейса Shape
     * подсчет площади куба
     */

    @Override
    public double area() {
        return 6 * edge * edge;
    }
}
