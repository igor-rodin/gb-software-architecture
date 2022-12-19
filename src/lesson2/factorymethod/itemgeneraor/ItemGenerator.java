package lesson2.factorymethod.itemgeneraor;

import lesson2.factorymethod.item.GiftItem;

public abstract class ItemGenerator {

    public void openGift() {
        GiftItem giftItem = createGiftItem();
        System.out.println(giftItem.open());
    }
    public abstract GiftItem createGiftItem();
}
