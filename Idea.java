/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * Idea is a sub-class to the super class credits.
 * this gives a small idea, on how I created this project.
 */

public class Idea extends Credits {
  
  void bye() {
    super.bye();
    System.out.println("\n");
    System.out.println("This Integration Project is to help understand the basic functionality, implementation,\n" +
            "and critical thinking in programming. The project performs simple widgets, that imitated a windows widget\n" +
            "toolbar. The project was programmed using Java Programming and implemented skills such as Class, Objects,\n" +
            "Array, Conditional Loops, User Input, Enhance If-Loop, Inheritance, and Polymorphism.");
  }
}
