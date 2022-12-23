package lesson3.task1;

import lesson3.task1.abstractcars.AbstractCar;
import lesson3.task1.interfaces.FillingStation;
import lesson3.task1.interfaces.Wiping;

public class RenaultCar extends AbstractCar implements Wiping {
    public RenaultCar(String brand, String model, BodyType bodyType, FuelType fuelType, int numberWheels) {
        super(brand, model, bodyType, fuelType, numberWheels);
    }

    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void service() {
        System.out.println("Servicing...");
    }

    @Override
    public int gearShift() {
        int nextGear = 2;
        System.out.println("Shifting gear to " + nextGear);
        return nextGear;
    }

    @Override
    public void turnOnHeadLight() {
        System.out.println("Headlights on...");
    }

    @Override
    public void turnOffHeadLight() {
        System.out.println("Headlights off...");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Wipers on...");
    }

    @Override
    public void turnOffWipers() {
        System.out.println("Wipers off...");
    }

    @Override
    public boolean wipingWindshield() {
        return false;
    }

    @Override
    public boolean wipingHeadLights() {
        return false;
    }

    @Override
    public boolean wipingMirrors() {
        return false;
    }
}
