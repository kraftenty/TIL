public class Main {
    public static void main(String[] args) {
        SmartHome home = new SmartHome();
        
        home.report();
        home.airConditioner.on();
        home.report();
        home.airConditioner.off();
        home.report();
    }
}