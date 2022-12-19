package lesson2.command.impl;

import lesson2.command.interfaces.Command;
import lesson2.command.storage.Storage;

public class InsertCommand implements Command {
    private Storage storage;

    public InsertCommand(final Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        long id = storage.insert();
        System.out.println(String.format("Вставка записи с id %d", id));
    }
}
