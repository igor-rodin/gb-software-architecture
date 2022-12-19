package lesson2.factorymethod;

import lesson2.factorymethod.itemgeneraor.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> pathWithTreasures = List.of(new MagicScrollGenerator(), new GemsGenerator(), new GoldGenerator(),
                new EmptyItemGenerator(), new JediSwordGenerator(), new GemsGenerator(), new HealingSpellGenerator());

        pathWithTreasures.forEach(ItemGenerator::openGift);
    }
}
