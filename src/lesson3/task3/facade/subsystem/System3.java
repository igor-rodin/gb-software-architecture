package lesson3.task3.facade.subsystem;

public class System3 {
    public void collect() {
        System.out.println("Method from " + this.getClass().getSimpleName());
    }
}
