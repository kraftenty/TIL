public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(int diceNumber) {
        System.out.println("Player " + name + ": 주사위 " + diceNumber + " 수신하였음.");
    }
}