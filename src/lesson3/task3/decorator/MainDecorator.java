package lesson3.task3.decorator;

import lesson3.task3.decorator.Component;
import lesson3.task3.decorator.ConcreteComponent;
import lesson3.task3.decorator.ConcreteDecoratorA;

public class MainDecorator {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("*".repeat(80));
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(concreteComponent);
        decoratorA.setAddedStateA("State A");
        decoratorA.operation();
        System.out.println("*".repeat(80));
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(decoratorA);
        concreteDecoratorB.operation();
    }
}
