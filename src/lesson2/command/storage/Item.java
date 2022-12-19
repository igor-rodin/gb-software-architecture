package lesson2.command.storage;

public class Item {
    private String title;

    public Item(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getTitle();
    }

    public String getTitle() {
        return title;
    }
}
