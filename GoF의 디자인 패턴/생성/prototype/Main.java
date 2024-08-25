public class Main {
    public static void main(String[] args) {
        Prototype original = new ConcretePrototype("Original");
        Prototype copy = (ConcretePrototype) original.clone();

        original.printInfo();
        copy.printInfo();
    }    
}
