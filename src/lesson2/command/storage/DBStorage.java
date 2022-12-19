package lesson2.command.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DBStorage implements Storage {
    @Override
    public long insert() {
        return new Random().nextLong();
    }

    @Override
    public boolean update(long id) {
        return id % 3 == 0;
    }

    @Override
    public boolean delete(long id) {
        return id % 5 == 0;
    }

    @Override
    public List<Item> select() {
        return List.of(new Item("Item 1"), new Item("Item 2"), new Item("Item 3"));
    }
}
