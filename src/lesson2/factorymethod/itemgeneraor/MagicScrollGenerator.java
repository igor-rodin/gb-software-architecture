package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.MagicScrollItem;

public class MagicScrollGenerator extends ItemGenerator {
    @Override
    public GiftItem createGiftItem() {
        return new MagicScrollItem();
    }
}
