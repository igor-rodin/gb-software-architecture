package lesson2.factorymethod.item.concreteitem;

import lesson2.factorymethod.item.GiftItem;

public class MagicScrollItem implements GiftItem {
    @Override
    public String open() {
        return "Вы нашли магический свиток!";
    }
}
