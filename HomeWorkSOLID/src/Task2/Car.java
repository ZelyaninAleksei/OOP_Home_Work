package Task2;

import Task2.core.Vehicle;
import Task2.interfaces.SpeedCalculation;

//класс автомобиль (наследник Vehicle)
public class Car extends Vehicle implements SpeedCalculation {
    double MaxSpeed;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    /**
     * реализация интерфейса SpeedCalculation
     * @return возвращает допустимую скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }    
}
