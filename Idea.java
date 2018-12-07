// Kevin Mak COP2006 Introduction to Programming

/**
 * Idea is a sub-class to the super class credits.
 * this gives a small idea, on how I created this project.
 * @author Kevin
 *
 */

public class Idea extends Credits {
  
  void bye() {
    super.bye();
    System.out.println("\nProject: This Integration project was given,"
        + " to increase our knowledge of the Java langauge.");
    System.out.println("I started with a simply Riddle Quiz, but with more requirements added"
        + "it got diffcult to integrate revelent topics.");
    System.out.println(" So, I decided to add other classes, and call methods to main."
        + " Allowing the user to input a number for an option."
        + "\nTherefore, this project became a kind of like a widget?.");
  }
}
