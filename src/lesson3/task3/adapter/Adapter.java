package lesson3.task3.adapter;

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.specificRequest();
    }
}
