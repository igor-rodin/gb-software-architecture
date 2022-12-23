package lesson3.task3.facade.subsystem;

public class System1 {
    public void call() {
        System.out.println("Method from " + this.getClass().getSimpleName());
    }
}
