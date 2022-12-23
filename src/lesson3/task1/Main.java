package lesson3.task1;

import lesson3.task1.abstractcars.AbstractCar;
import lesson3.task1.fillingstations.DieselFillingStation;
import lesson3.task1.fillingstations.GasolineFillingStation;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        AbstractCar kaptur = new RenaultCar("Renault", "Kaptur", BodyType.SUV, FuelType.GASOLINE, 4);
        kaptur.setColor(Color.DARK_GRAY);
        kaptur.setGearBox(GearBox.AT);
        kaptur.setEngineCapacity(2.0);
        kaptur.setFillingStation(new GasolineFillingStation());

        kaptur.move();
        kaptur.gearShift();
        kaptur.service();

        GasolineCar gasolineCar = new GasolineCar("SomeBrand", "Model", BodyType.SEDAN, FuelType.GASOLINE, 4);
        gasolineCar.setFillingStation(new GasolineFillingStation());
        gasolineCar.getFillingStation().refueling(35.0);

        DieselCar dieselCar = new DieselCar("AnotherBrand", "Diesel", BodyType.PICKUP, FuelType.DIESEL, 4);
        dieselCar.setFillingStation(new DieselFillingStation());
        dieselCar.getFillingStation().refueling(40.0);
    }
}
