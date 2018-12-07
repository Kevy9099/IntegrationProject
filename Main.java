/*
* 
*Integration Project: My Integration Project is going to be a Trivia Quiz Game.
* Questions will be base of multiple riddles. The programs greets the user, by asking their name
* first and then a message. Next, the program waits for an input "letter" for each questions. the
* point systems increments once, for every correct answer. While it does nothing for a wrong
* answer. Score is base from a fraction. (success / total)
*/

/*
* Java 8 Primitive Data-types: A primitive type is predefined by the language and is named by a 
* reserved keyword. Primitive values do not share state with other primitive values. The range of
* values is calculated as −(2^(n−1)) to (2^(n−1))−1; where n is the number of bits required.
* 
* byte: 8-bit, Range of values that can be stored: are from -128(min) to 127(max). The byte data
* type can be useful for saving memory in large arrays. byte = 103;
* 
* short: 16-bit, Range of values can be stored are from −32768(min) to 32767(max). Also, using
* short data type to save memory in large arrays. short = 4323;
* 
* int: 32-bit, Range of values can be stored are from -2^31(min) to 2^(31-(1))(max). We use int
* data type to define a 32-bit undefined integer. int = 4;
* 
* long: 64-bit,Range of values that can be stored are from -2^63(min) to 2^(63-(1))(max). long data
* type to represent large integer values. long = 230,465,323L;
* 
* float: A single-precision 32-bit floating point. Float data type represent, save memory in large
* arrays of floating point numbers. float = 8.0f
* 
* double: A double-precision 64-bit floating point. double = 4.0; Used for decimal values this data
* type should never be used for precise values, such as currency.
* 
* boolean: Has only two possible values: true and false. This data type represents one bit of
* information. boolean = true/false;
* 
* char: A single 16-bit Unicode character. char = 'A';
*/
/**
* @author Kevin Mak 
* @version COP2006 Introduction to Programming
* @since 09/03/18
*/
import java.util.Scanner; // java library, import scanner.

/**
 * main class will hold all other methods, and call them when user inputs.
 * @author Kevin
 *
 */

public class Main {
  
  /**
   * call other methods.
   * @param args of strings.
   */
  public static void main(String[] args) { 
    
    @SuppressWarnings("resource")
    Scanner stdin = new Scanner(System.in);//new scanner for user input.

    System.out.println("Choose An Option: ");
    System.out.println("1. Quiz Game");
    System.out.println("2. Dice Game");
    System.out.println("3. Clock");
    System.out.println("4. Math");
    System.out.println("5. Calendar");
    System.out.println("6. Summary");

    int option = stdin.nextInt();
    
    if (option == 1) {
      PlayQuiz fun = new PlayQuiz(){};
      fun.funQuiz(); //Will call playQuiz class.  
    } else if (option == 2) {
      PlayDiceGame dice = new PlayDiceGame();
      dice.funDice(); // will call PlayDiceGame class.
    } else if (option == 3) {

      PlayClock timer = new PlayClock();
      PlayClock timer2 = new PlayClock(5);
      PlayClock timer3 = new PlayClock(5,13);
      PlayClock timer4 = new PlayClock(5,13,43);

      System.out.printf("%s%n", timer.toMilitary());
      System.out.printf("%s%n", timer2.toMilitary());
      System.out.printf("%s%n", timer3.toMilitary());
      System.out.printf("%s%n", timer4.toMilitary());

    } else if (option == 6) {
      Credits[] end = new Credits[4];
      end[0] = new Idea(); //polymorphism array
      end[1] = new Myself();
      end[2] = new Specialthings();
      end[3] = new Endinggreetings();

      for (int x = 0; x < 4; ++ x) {
        end[x].bye();
      }
    } else if (option == 4) {
      ArrayMath mint = new ArrayMath();
      mint.arrayMath2();
    } else if (option == 5) {
      LocalCalendar time = new LocalCalendar();
      time.calendar();
    } else {
      System.out.println("Choose an option between 1 - 4.");
    }
  }
}