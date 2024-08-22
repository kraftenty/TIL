import java.util.*;

public class FlyweightFactory {
    private final Map<String, Flyweight> flyweightPool = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        flyweightPool.putIfAbsent(key, new Flyweight(key));
        return flyweightPool.get(key);
    }
}