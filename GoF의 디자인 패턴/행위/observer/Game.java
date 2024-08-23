
import java.util.*;

public class Game {

    private List<Player> playerList = new ArrayList<>();
    private Random random = new Random();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 던졌음. " + diceNumber);
        Iterator<Player> iterator = playerList.iterator();
        while(iterator.hasNext()){
            iterator.next().update(diceNumber);
        }
    }
}