package lesson2.factorymethod.item.concreteitem;

import lesson2.factorymethod.item.GiftItem;

public class EmptyItem implements GiftItem {
    @Override
    public String open() {
        return "К сожалению, Вы ничего не нашли(";
    }
}
