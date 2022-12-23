package lesson3.task3.facade;

import lesson3.task3.facade.subsystem.System1;
import lesson3.task3.facade.subsystem.System2;
import lesson3.task3.facade.subsystem.System3;

public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeMethod();
    }
}
