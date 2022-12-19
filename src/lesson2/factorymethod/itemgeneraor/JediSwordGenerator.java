package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.JediSwordItem;

public class JediSwordGenerator extends ItemGenerator{
    @Override
    public GiftItem createGiftItem() {
        return new JediSwordItem();
    }
}
