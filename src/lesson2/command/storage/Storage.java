package lesson2.command.storage;

import java.util.List;

public interface Storage {
    long insert();
    boolean update(long id);
    boolean delete(long id);

    List<Item> select();
}
