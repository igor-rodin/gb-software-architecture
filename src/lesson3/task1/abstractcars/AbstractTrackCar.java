package lesson3.task1.abstractcars;

import lesson3.task1.BodyType;
import lesson3.task1.FuelType;

public abstract class AbstractTrackCar extends AbstractCar {
    private double loadCapacity;
    public AbstractTrackCar(String brand, String model, BodyType bodyType, FuelType fuelType, int numberWheels, double loadCapacity) {
        super(brand, model, bodyType, fuelType, numberWheels);
        this.loadCapacity = loadCapacity;
    }

    double getLoadCapacity(){
        return loadCapacity;
    }
    public abstract void turnOnFogLights();
    public  abstract void turnOffFogLights();
    public abstract void shipping(double goodCapacity);
}
