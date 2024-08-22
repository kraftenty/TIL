public class Flyweight {
    private final String data;
    
    public Flyweight(String data) {
        this.data = data;
    }

    public void operation() {
        System.out.println("data: " + data);
    }
}
