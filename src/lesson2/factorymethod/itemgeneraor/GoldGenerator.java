package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.GoldItem;

public class GoldGenerator extends ItemGenerator{
    @Override
    public GiftItem createGiftItem() {
        return new GoldItem();
    }
}
