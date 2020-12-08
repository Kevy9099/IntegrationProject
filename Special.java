/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * Specialthings a sub-class to the super class Credits.
 * It read and writes a favorite color and lucky numbers, basically author interests.
 */

public class Special extends Credits {

  void bye() {
    System.out.println("\n");
    System.out.println("Author Interest and Hobbies: ");
    display_color();
    display_num();
    display_food();
    display_animal();
    display_birthday();
    display_hobby();
  }
  
  private static void display_color() {
    System.out.println("Favorite colors are " + "Blue" + "Red.");
    
  }

  private static void display_num() {
    System.out.println("My lucky numbers is " + 2 + 4 + ".");
   
  }

  private static void display_food(){
    System.out.println("My favorite food is pizza.");
  }

  private static void display_animal(){
    System.out.println("My dog name is Milo.");
  }

  private static void display_birthday(){
    System.out.println("My birthday is October 15, 1994.");
  }

  private static void display_hobby(){
    System.out.println("My hobbies are basketball, video games, and watching netflix.");
  }
}