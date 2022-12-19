package lesson2.factorymethod.item.concreteitem;

import lesson2.factorymethod.item.GiftItem;

import java.util.Random;

public class GoldItem implements GiftItem {
    public static final int MAX_GOLD_COINS = 20;
    public static final int MIN_GOLD_COINS = 5;
    private static Random rnd = new Random();
    @Override
    public String open() {
        return String.format("Вы нашли %d золотых монет!", rnd.nextInt(MIN_GOLD_COINS, MAX_GOLD_COINS));
    }
}
