public class Main {
    
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("s1.hashCode = " + s1.hashCode() + ", s2.hashCode = " + s2.hashCode());

        s1.hello();
    }
}
