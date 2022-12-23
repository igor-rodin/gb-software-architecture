package lesson3.task1.abstractcars;

import lesson3.task1.BodyType;
import lesson3.task1.FuelType;
import lesson3.task1.interfaces.Sweeping;

public abstract class AbstractSweepCar extends AbstractCar implements Sweeping {

    public AbstractSweepCar(String brand, String model, BodyType bodyType, FuelType fuelType, int numberWheels) {
        super(brand, model, bodyType, fuelType, numberWheels);
    }
}
