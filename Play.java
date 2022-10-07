import java.util.ArrayList;

public class Play {
  public static void main(String[] args) {

    Strat player1 = new Akshaj();
    Strat player2 = new RandomGuesser();
    Strat player3 = new RandomUnderTwenty();
    Strat player4 = new ImitateWinner();
    Strat player5 = new ImitateWinner();
    Strat player6 = new ImitateWinner();
    Strat player7 = new Akshaj();

    ArrayList<Strat> players = new ArrayList<>();
    players.add(player1);
    players.add(player2);
    players.add(player3);
    players.add(player5);
    players.add(player6);
    players.add(player4);
    players.add(player7);

    /*
     * int n = 0;
     * while (n < 50)
     * for (int i = 10; i <= 50; i++) {
     * Akshaj.n = i;
     * if (TwoThirds.play(players, 10) == 6) {
     * n++;
     * System.out.println(i);
     * }
     * }
     */
    TwoThirds.play(players, 20);

  }
}