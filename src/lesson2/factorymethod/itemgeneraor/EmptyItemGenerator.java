package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.EmptyItem;

public class EmptyItemGenerator extends ItemGenerator {
    @Override
    public GiftItem createGiftItem() {
        return new EmptyItem();
    }
}
