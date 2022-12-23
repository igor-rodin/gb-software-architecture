package lesson3.task3.decorator;

public abstract class Decorator extends Component {
    private final Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
