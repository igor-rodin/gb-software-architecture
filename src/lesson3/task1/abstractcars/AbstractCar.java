package lesson3.task1.abstractcars;

import lesson3.task1.BodyType;
import lesson3.task1.FuelType;
import lesson3.task1.GearBox;
import lesson3.task1.interfaces.FillingStation;

import java.awt.*;

public abstract class AbstractCar {
    private String brand;
    private String model;
    private Color color;
    private BodyType bodyType;
    private FuelType fuelType;
    private int numberWheels;
    private GearBox gearBox;
    private double engineCapacity;
    private FillingStation fillingStation;

    public AbstractCar(String brand, String model, BodyType bodyType, FuelType fuelType, int numberWheels) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.numberWheels = numberWheels;
    }

    public abstract void move();

    public abstract void service();

    public abstract int gearShift();

    public abstract void turnOnHeadLight();

    public abstract void turnOffHeadLight();

    public abstract void turnOnWipers();

    public abstract void turnOffWipers();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setFillingStation(FillingStation fillingStation) {
        this.fillingStation = fillingStation;
    }

    public FillingStation getFillingStation() {
        return fillingStation;
    }
}
