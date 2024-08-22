public class Main {
    
    public static void main(String[] args) {
        
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fw1 = factory.getFlyweight("A");
        Flyweight fw2 = factory.getFlyweight("B");
        Flyweight fw3 = factory.getFlyweight("A"); // 재사용

        System.out.println("fw1.hashCode = " + fw1.hashCode() + ", fw3.hashCode = " + fw3.hashCode());
    }
}
