package Task2.core;

/**
 * абстрактный класс транспортное средство
 */
public abstract class Vehicle {
    /**
     * maxSpeed - максимальная корость
     */
    int maxSpeed;

    /**
     * 
     * @param maxSpeed - максимальная скорость
     */
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * 
     * @return возвращает максимальную скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}