public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Player player1 = new Player("p1");
        Player player2 = new Player("p2");
        Player player3 = new Player("p3");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        game.play();
    }
}