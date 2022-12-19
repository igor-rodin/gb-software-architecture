package lesson2.command.impl;

import lesson2.command.interfaces.Command;
import lesson2.command.storage.Storage;

import java.util.Random;

public class DeleteCommand implements Command {
    private final Storage storage;

    public DeleteCommand(final Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        long id = getRawIdToDelete();
        boolean result =  storage.delete(id);
        if (result) {
            System.out.println(String.format("Запись с id %d удалена", id));
        } else {
            System.out.println(String.format("Запись с id %d не удалось удалить", id));
        }
    }

    public long getRawIdToDelete() {
        return new Random().nextLong();
    }
}
