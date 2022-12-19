package lesson2.command.impl;

import lesson2.command.interfaces.Command;
import lesson2.command.storage.Storage;

import java.util.Random;

public class UpdateCommand implements Command {
    private final Storage storage;

    public UpdateCommand(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        long id = getRawIdToUpdate();
        boolean result = storage.update(id);
        if (result) {
            System.out.println(String.format("Запись с id %d обновлена", id));
        } else {
            System.out.println(String.format("Запись с id %d не удалось обновить", id));
        }
    }

    public long getRawIdToUpdate() {
        return new Random().nextLong();
    }
}
