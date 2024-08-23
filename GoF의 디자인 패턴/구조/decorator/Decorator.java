public abstract class Decorator implements Component {
    Component wrappee;

    Decorator(Component component) {
        this.wrappee = component;
    }

    public void operation() {
        wrappee.operation();
    }
}