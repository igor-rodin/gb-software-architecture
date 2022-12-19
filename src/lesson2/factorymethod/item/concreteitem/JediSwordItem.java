package lesson2.factorymethod.item.concreteitem;

import lesson2.factorymethod.item.GiftItem;

public class JediSwordItem implements GiftItem {
    @Override
    public String open() {
        return "Вы нашли мечь джедая!";
    }
}
