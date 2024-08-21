public class RobotDogAdaptor implements Animal {

    private RobotDog robotDog;

    public RobotDogAdaptor(RobotDog robotDog) {
        this.robotDog = robotDog;
    }



    @Override
    public void sound() {
        robotDog.play();
    }
    
}
