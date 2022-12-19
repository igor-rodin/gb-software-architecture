package lesson2.factorymethod.item.concreteitem;

import lesson2.factorymethod.item.GiftItem;

public class HealingSpellItem implements GiftItem {
    @Override
    public String open() {
        return "Вы нашли излечивающее заклятье!";
    }
}
