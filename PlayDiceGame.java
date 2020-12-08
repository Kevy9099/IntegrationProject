import java.util.Random; /* the random import allows the IDE to use random numbers, depending what i
set it to.*/
/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * A Random dice roller allows the user to play against computer logic.
 */

public class PlayDiceGame {

    /**
     * fun dice methods is a random dice game. generates user and computer dice roll.
     * will be called by main.
     */
    public void diceGame() {

        Random random = new Random();
        int totalNumberOfTurns = 10;
        int computerDie;
        int computerScore = 0;
        int userDie;
        int userScore = 0;

        for (int turn = 1; turn <= totalNumberOfTurns; turn++) { // <= means greater or equal to.
            computerDie = random.nextInt(6) + 1;
            userDie = random.nextInt(6) + 1;

            if (computerDie > userDie) {
                computerScore += 1;
                System.out.println("Computer won turn " + turn);
            } else {
                userScore = getUserScore(computerDie, userDie, userScore, turn);
            }
        }

        System.out.println();

        if (computerScore > userScore) {
            System.out.println("Computer was the grand winner, winning " + computerScore + " out of "
                    + totalNumberOfTurns + " turns");
        } else if (userScore > computerScore) {
            System.out.println("User was the grand winner, winning " + userScore + " out of "
                    + totalNumberOfTurns + " turns");
        } else {
            System.out.println("It was a tie with computer winning " + computerScore
                    + " turns and user winning" + userScore + " turns all out of " + totalNumberOfTurns);
        }
    }

    private int getUserScore(int computerDie, int userDie, int userScore, int turn) {
        if (userDie > computerDie) {
            System.out.println("User won turn " + turn);
            userScore += 1; // the += means userScore is +1 to whatever was added before.
        } else if (userDie == computerDie) { /* the == will compare the userDie to computerDie
    to check if both players hit a tie breaker.*/
            System.out.println("Trun " + turn + " was a tie");
        }
        return userScore;
    }

}