public class Main {
    public static void main(String[] args) {
        Component original = new ConcreteComponent();
        original.operation();

        Component decoedA = new DecoratorA(original);
        decoedA.operation();

        Component decoedB = new DecoratorB(original);
        decoedB.operation();

        // Wrapper 형태로 장식
        Component decoedAandB = new DecoratorA(new DecoratorB(original));
        decoedAandB.operation();
    }
}