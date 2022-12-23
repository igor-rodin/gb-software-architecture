package lesson3.task3.facade.subsystem;

public class System2 {
    public void printInfo() {
        System.out.println("Method from " + this.getClass().getSimpleName());
    }
}
