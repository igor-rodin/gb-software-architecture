package lesson3.task3.adapter;

public class Client {
    private Target target = new Adapter();

    public void callTargetMethod() {
        target.Request();
    }
}
