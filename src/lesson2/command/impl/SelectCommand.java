package lesson2.command.impl;

import lesson2.command.interfaces.Command;
import lesson2.command.storage.Item;
import lesson2.command.storage.Storage;

import java.util.List;

public class SelectCommand implements Command {
    private final Storage storage;

    public SelectCommand(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        List<Item> list = storage.select();
        System.out.println(list );
    }
}
