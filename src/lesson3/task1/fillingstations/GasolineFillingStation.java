package lesson3.task1.fillingstations;

import lesson3.task1.interfaces.FillingStation;

public class GasolineFillingStation implements FillingStation {
    @Override
    public boolean refueling(double fuelVolume) {
        System.out.println("Refueling with gasoline: " + fuelVolume);
        return true;
    }
}
