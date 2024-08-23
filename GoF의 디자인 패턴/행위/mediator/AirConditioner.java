public class AirConditioner extends Participant {

    private boolean run = false;

    public AirConditioner(Mediator mediator) {
        super(mediator);
    }

    public void on() {
        if (run) {
            return;
        }
        run = true;
        mediator.participantChanged(this);
    }

    public void off() {
        if (!run) {
            return;
        }
        run = false;
        mediator.participantChanged(this);
    }

    public boolean isRunning() {
        return run;
    }

    @Override
    public String toString() {
        if (run) {
            return "[에어컨] 켜짐.";
        } else {
            return "[에어컨] 꺼짐.";
        }
    }

}