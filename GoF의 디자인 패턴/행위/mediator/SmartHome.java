public class SmartHome implements Mediator {

    public Window window = new Window(this);
    public AirConditioner airConditioner = new AirConditioner(this);

    // 참여자들 간의 관계가 모두 이 메서드에 집중되어 있음.
    @Override
    public void participantChanged(Participant participant) {
        if (participant instanceof Window) {
            if (!window.isClosed()) {
                airConditioner.off();
            } else {
                airConditioner.on();
            }
        } 
        if (participant instanceof AirConditioner) {
            if (airConditioner.isRunning()) {
                window.close();
            } else {
                window.open();
                
            }
            
        }
    }

    public void report() {
        System.out.println("=== [홈 상태] ===");
        System.out.println(window);
        System.out.println(airConditioner);
    }
    
}