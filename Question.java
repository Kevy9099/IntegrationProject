//Kevin Mak COP2006 Introduction to Programming
/**This method Question is a variable to accept a string and return a string.
 * @author Kevin
 * @param accepts a prompt.
 * @return an answer.
 */

public class Question { // attributes class
  
  String prompt;
  String answer;
  boolean isCorrect; // true or false

  /**
   * Accepts a this prompt for this method only.
   * @param prompt for Question
   * @param answer for Question
  */
  public Question(String prompt, String answer) { 
    this.prompt = prompt;
    this.answer = answer;

  }

}