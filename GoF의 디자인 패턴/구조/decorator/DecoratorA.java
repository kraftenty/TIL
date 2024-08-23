public class DecoratorA extends Decorator {
    
    public DecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        operationA();
    }

    void operationA() {
        System.out.println("추가 동작 A");
    }
    
}