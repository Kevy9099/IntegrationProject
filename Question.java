/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * The class Question accepts a String for prompt, answer, and isCorrect.
 * These objects reads and writes the String to class PlayQuiz.
 */
public class Question {
  
  String prompt;
  String answer;
  boolean isCorrect;

  /**
   * Accepts a this prompt for this method only.
   * @param prompt The Questions sentence for PlayQuiz.
   * @param answer The Answers to Questions for PlayQuiz.
  */
  public Question(String prompt, String answer) { 
    this.prompt = prompt;
    this.answer = answer;

  }

}