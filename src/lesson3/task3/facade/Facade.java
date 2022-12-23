package lesson3.task3.facade;

import lesson3.task3.facade.subsystem.System1;
import lesson3.task3.facade.subsystem.System2;
import lesson3.task3.facade.subsystem.System3;

public class Facade {
    private System1 sys1 = new System1();
    private System2 sys2 = new System2();
    private System3 sys3 = new System3();

    void facadeMethod() {
        sys1.call();
        sys3.collect();
        sys2.printInfo();
    }
}
