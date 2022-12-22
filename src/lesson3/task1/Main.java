package lesson3.task1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car kaptur = new RenaultCar();
        kaptur.setBrand("Renault");
        kaptur.setColor(Color.DARK_GRAY);
        kaptur.setModel("Kaptur");
        kaptur.setBodyType(BodyType.SUV);
        kaptur.setFuelType(FuelType.GASOLINE);
        kaptur.setGearBox(GearBox.AT);
        kaptur.setEngineCapacity(2.0);
        kaptur.setNumberWheels(4);

        kaptur.move();
        kaptur.gearShift();
        kaptur.service();

        GasolineCar gasolineCar = new GasolineCar();
        gasolineCar.refueling(30.0);

        DieselCar dieselCar = new DieselCar();
        dieselCar.refueling(40.0);
    }
}
