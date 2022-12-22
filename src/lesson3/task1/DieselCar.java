package lesson3.task1;

import lesson3.task1.interfaces.FillingStation;

public class DieselCar extends Car implements FillingStation {
    public DieselCar() {
        setFuelType(FuelType.DIESEL);
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

    @Override
    public boolean refueling(double fuelVolume) {
        System.out.println("Refueling with " + getFuelType().name());
        return true;
    }
}
