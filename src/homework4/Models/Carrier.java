package homework4.Models;

import java.util.EnumSet;

/**
 * Модель перевозчика
 */
public class Carrier {

    enum ZONE_TYPE {
        ZONE_ONE, ZONE_TWO, ZONE_THREE, ZONE_FOUR
    }
    private int id;
    private long cardNumber;

    private EnumSet<ZONE_TYPE> zones  = EnumSet.allOf(ZONE_TYPE.class);
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public EnumSet<ZONE_TYPE> getZones() {
        return zones;
    }
}
