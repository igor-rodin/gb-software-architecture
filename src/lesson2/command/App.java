package lesson2.command;

import lesson2.command.impl.DeleteCommand;
import lesson2.command.impl.InsertCommand;
import lesson2.command.impl.SelectCommand;
import lesson2.command.impl.UpdateCommand;
import lesson2.command.interfaces.Command;
import lesson2.command.storage.DBStorage;

import java.util.Map;

public class App {
    private final DBStorage storage = new DBStorage();
    Map<CommandType, Command> menu = Map.of(CommandType.INSERT, new InsertCommand(storage),
            CommandType.UPDATE, new UpdateCommand(storage),
            CommandType.DELETE, new DeleteCommand(storage),
            CommandType.SELECT, new SelectCommand(storage));

    public void insertRaw() {
        menu.get(CommandType.INSERT).execute();
    }

    public void deleteRaw() {
        menu.get(CommandType.DELETE).execute();
    }

    public void updateRaw() {
        menu.get(CommandType.UPDATE).execute();
    }

    public void seelectRaws() {
        menu.get(CommandType.SELECT).execute();
    }
}
