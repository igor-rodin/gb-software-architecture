package lesson3.task1;

import lesson3.task1.abstractcars.AbstractCar;
import lesson3.task1.interfaces.FillingStation;

public class DieselCar extends AbstractCar {

    public DieselCar(String brand, String model, BodyType bodyType, FuelType fuelType, int numberWheels) {
        super(brand, model, bodyType, fuelType, numberWheels);
    }

    @Override
    public void move() {

    }

    @Override
    public void service() {

    }

    @Override
    public int gearShift() {
        return 2;
    }

    @Override
    public void turnOnHeadLight() {

    }

    @Override
    public void turnOffHeadLight() {

    }

    @Override
    public void turnOnWipers() {

    }

    @Override
    public void turnOffWipers() {

    }
}
