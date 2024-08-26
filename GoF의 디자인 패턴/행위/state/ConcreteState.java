public class ConcreteState implements State {
    
    @Override
    public void handle() {
        System.out.println("ConcreteState: handling request.");
    }
}
