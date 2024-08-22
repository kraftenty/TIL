public class Singleton {
    
    private static Singleton instance;

    private Singleton() {}

    // synchronized를 사용하여 멀티쓰레드 환경에서 safe하도록 함.
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("hello");
    }
}
