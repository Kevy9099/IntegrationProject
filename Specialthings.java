//Kevin Mak COP2006 Introduction to Programming
//Method Overloading

/**
 * Specialthings a sub-class to the super class Credits.
 * This is just fun "things" I like.
 * @author Kevin
 *
 */

public class Specialthings extends Credits {

  void bye() {
    display("Blue","Red");
    display(2,4);
  }
  
  private static void display(String a,String b) {
    System.out.println("Favorite Color: " + a + b);
    
  }

  private static void display(int a, int b) {
    System.out.println("Lucky Numbers: " + a + b);
   
  }
}