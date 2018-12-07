import java.util.Random; /* the random import allows the IDE to use random numbers, depending what i
set it to.*/
/*
 * Kevin Mak COP2006 Introduction to Programming
 */

public class PlayDiceGame {
  
  /**
   * fun dice methods is a random dice game. generates user and computer dice roll.
   * will be called by main.
   */
  public void funDice() {
    
    Random random = new Random();
    int totalNumberOfTurns = 10;
    int computerDie;
    int computerScore = 0;
    int userDie;
    int userScore = 0;

    for (int turn = 1; turn <= totalNumberOfTurns; turn++) { // <= means greater or equal to.
      computerDie = random.nextInt(6) + 1;
      userDie = random.nextInt(6) + 1;
      /*
       * the if-else statments allows me to create a score, for a random dice game. this game is
       * played between a computer and the user. it is random, so the user doesnt need to input
       * anything.
       */

      if (computerDie > userDie) {
        computerScore += 1;
        System.out.println("Computer won turn " + turn);
      } else if (userDie > computerDie) {
        System.out.println("User won turn " + turn);
        userScore += 1; // the += means userScore is +1 to whatever was added before.
      } else if (userDie == computerDie) { /* the == will compare the userDie to computerDie 
      to check if both players hit a tie breaker.*/
        System.out.println("Trun " + turn + " was a tie");
      }
    }

    System.out.println();

    if (computerScore > userScore) {
      System.out.println("Computer was the grand winner, winning " + computerScore + " out of "
          + totalNumberOfTurns + " turns");
    } else if (userScore > computerScore) {
      System.out.println("User was the grand winner, winning " + userScore + " out of "
          + totalNumberOfTurns + " turns");
    } else if (computerScore == userScore) {
      System.out.println("It was a tie with computer winning " + computerScore
          + " turns and user winning" + userScore + " turns all out of " + totalNumberOfTurns);
    }
  }

}