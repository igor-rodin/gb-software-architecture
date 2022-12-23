package lesson3.task3.decorator;

public class ConcreteDecoratorB extends Decorator{
    private String addedStateB;
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addedBehavior(){
        System.out.println("addedBehavior...");
    }
    public String getAddedStateB() {
        return addedStateB;
    }

    public void setAddedStateB(String addedStateB) {
        this.addedStateB = addedStateB;
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
