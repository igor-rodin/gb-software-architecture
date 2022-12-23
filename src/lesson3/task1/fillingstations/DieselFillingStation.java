package lesson3.task1.fillingstations;

import lesson3.task1.interfaces.FillingStation;

public class DieselFillingStation implements FillingStation {
    @Override
    public boolean refueling(double fuelVolume) {
        System.out.println("Refueling with diesel: " + fuelVolume);
        return true;
    }
}
