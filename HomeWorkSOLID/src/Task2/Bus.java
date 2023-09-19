package Task2;

import Task2.core.Vehicle;
import Task2.interfaces.SpeedCalculation;

//класс автобус (наследник Vehicle)
public class Bus extends Vehicle implements SpeedCalculation {
    double MaxSpeed;

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    /**
     * реализация интерфейса SpeedCalculation
     * @return возвращает допустимую скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }    
}