package lesson3.task3.decorator;

public class ConcreteDecoratorA extends Decorator{
    private String addedStateA;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public String getAddedStateA() {
        return addedStateA;
    }

    public void setAddedStateA(String addedStateA) {
        this.addedStateA = addedStateA;
    }

    @Override
    public void operation() {
        System.out.println(addedStateA);
        super.operation();
    }
}
