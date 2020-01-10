package Lesson6;

public class GuessMachine {

    private int number, guesses, guess;

    public GuessMachine() {
        guesses = 0;
        number = (int) (Math.random() * 100) + 1;
    }

    public String giveHint() {
        String hint = guess + " is ";
        if (guess > number) {
            hint += "too high.";
        } else if (guess < number) {
            hint += "too low.";
        } else {
            hint += "correct!";
        }
        return hint;
    }

    boolean setGuess(int x) {
        if (x > 100 || x < 1) {
            return false;
        } else {
            guess = x;
            guesses++;
            return true;
        }
    }

    int getGuesses() {
        return guesses;
    }

}
