//Kevin Mak COP2006 Introduction to Programming

/**
 * EndingGreetings is a sub-class of super class Credits.
 * this gives the user a little "goodbye".
 * @author Kevin
 *
 */

public class EndingGreetings extends Credits {
  
  void bye() { 
    System.out.println("\nTherefore, the end of the semester is here! I hope you have wonderful: ");
    String[] str = {"Thanksgiving!", "Merry Christmas!", "And Happy New Years!"};
    for (String s : str) {  
      System.out.println(s);
    } // enhanced for-loop.
  }
}