package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;
import lesson2.factorymethod.item.concreteitem.HealingSpellItem;

public class HealingSpellGenerator extends ItemGenerator {
    @Override
    public GiftItem createGiftItem() {
        return new HealingSpellItem();
    }
}
