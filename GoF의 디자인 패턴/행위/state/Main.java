public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState());
        context.request();
    }    
}
