// Haha! You've been tricked. This is also Java.

public class Akshaj implements Strat {

    private int last_guess;
    private int last_winner;
    private int round;
    public static int n = 0;

    @Override
    public void newRound(int numWinsNeeded) {
        last_winner = 0;
        last_guess = 0;
        round = 0;
    }

    @Override
    public int getNumbner() {
        round++;
        if (Math.random() < 0.365 || round == 1) {
            last_guess = 80;
            return 80;
        } else {
            last_guess = last_winner;
            return last_winner;
        }
    }

    @Override
    public void roundEnded(boolean outcome, int[] opAnswers, int winner) {
        int sum = 0;
        for (int i = 0; i < opAnswers.length; i++)
            sum += opAnswers[i];
        last_winner = (int) (sum / opAnswers.length * 0.76);
        // If bot won round.
        if (winner == last_guess)
            System.out.println("🧠🧠🧠 Akshaj's Astonishingly Awesome Bot goes STONKS! 📈📈📈");
    }
}