/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * EndingGreetings is a sub-class of super class Credits.
 * This class is holiday good-bye message to the user that is using the program.
 */

public class EndingGreetings extends Credits {
  
  void bye() { 
    System.out.println("\nThanks for using this program and have a wonderful ");
    String[] str = {"Merry Christmas!", "&", "Happy New Years!"};
    for (String s : str) {  
      System.out.println(s);
    }
  }
}