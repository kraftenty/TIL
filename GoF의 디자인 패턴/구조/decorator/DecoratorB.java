public class DecoratorB extends Decorator {
    
    public DecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        operationB();
    }

    void operationB() {
        System.out.println("추가 동작 B");
    }
    
}