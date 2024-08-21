import java.util.*;

public class Client {
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new RobotDogAdaptor(new RobotDog()));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
