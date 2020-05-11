package chaptertwo.guessgame;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;
    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        int targetNumber = (int) (Math.random() * 10);
        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;
        boolean isPlayer1Right = false;
        boolean isPlayer2Right = false;
        boolean isPlayer3Right = false;
        while (true) {
            System.out.println("Число, которое нужно угадать " + targetNumber);
            player1.guess();
            player2.guess();
            player3.guess();
            guessPlayer1 = player1.guessNumber;
            guessPlayer2 = player2.guessNumber;
            guessPlayer3 = player3.guessNumber;
            System.out.println("Первый игрок думает, что " + guessPlayer1 + System.lineSeparator() + "Второй игрок думает, что " + guessPlayer2 + System.lineSeparator() + "Третий игрок думает, что " + guessPlayer3);
            if (guessPlayer1 == targetNumber) {
                isPlayer1Right = true;
            }
            if (guessPlayer2 == targetNumber) {
                isPlayer2Right = true;
            }
            if (guessPlayer3 == targetNumber) {
                isPlayer3Right = true;
            }
            if (isPlayer3Right || isPlayer2Right || isPlayer1Right) {
                System.out.println("У нас есть победитель");
                System.out.println("Первый игрок угадал?" + isPlayer1Right);
                System.out.println("Второй игрок угадал?" + isPlayer2Right);
                System.out.println("Третий игрок угадал?" + isPlayer3Right);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Пусть игроки попробуют еще раз");
            }
        }

    }
}
