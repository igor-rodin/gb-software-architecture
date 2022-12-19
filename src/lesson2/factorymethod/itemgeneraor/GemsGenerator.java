package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.GemsItem;

public class GemsGenerator extends ItemGenerator {
    @Override
    public GiftItem createGiftItem() {
        return new GemsItem();
    }
}
