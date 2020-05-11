package chaptertwo.guessgame;

public class Player {
    int guessNumber = 0;
    public void guess() {
        guessNumber = (int) (Math.random() * 10);
    }
}
