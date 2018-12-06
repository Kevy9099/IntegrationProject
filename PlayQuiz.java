import java.util.Scanner;

//Kevin Mak 
//COP2006 Introduction to Programming


public class PlayQuiz {
  
  /**
   * funQuiz is a method, that hold a quiz code. 
   * it will be called from main.
   */
  public void funQuiz() {
    @SuppressWarnings("resource")
    Scanner stdin = new Scanner(System.in); // new scanner for user input

    String usersName; // The user's name, as entered by the user.
    String input; // The user's name, first letter in name is upper case.

    System.out.println("Please enter your name: ");

    usersName = stdin.nextLine();

    input = usersName;

    /*
     * Three String Class .subString(): Returns the substring starting from the given
     * index(beginIndex) till the specified index(endIndex). .toUpperCase(): Simply used in
     * conversion of String into upper case. Line 134 .toLowerCase(): Conversion of String into
     * lower case, also on line 134 we're comparing for lower case letter.
     */

    String output = input.substring(0, 1).toUpperCase() + input.substring(1);

    System.out.println("Hello, " + output + ", Welcome To My Riddle Game! "); // The Greeting

    /*
     * The Final keyword makes variables value unchangeable: Final is define differently, depending
     * on how its used. Final Variable: A final variable can only be initialized once. Final Method:
     * A final method cannot be overridden by subclasses. Final Class: A final class cannot be
     * subclass.
     */

    /*
     * Escape Sequence: In these array of questions, the "\n" is being used to start a new line.
     */

    final String q1 = "1.)What goes up when the rain comes down?\n" // /n insert a new line.
        + "(a)Your Shadow\n(b)The Sun\n(c)An Umbrella\n(d)Clouds\n"; // Question 1
    final String q2 =
        "2.)What starts with a \"T\", ends with a \"T\", and has \"T\" in it, What am I?\n"
            + "(a)Bowl\n(b)Teapot\n(c)That\n(d)Taunt\n"; // Question 2
    final String q3 =
        "3.)What can point in every direction, but can't reach the destination by itself?\n"
            + "(a)Compass\n(b)Plate\n(c)Stars\n(d)UFO\n"; // Question 3
    final String q4 = "4.)Which word in the dictionary is spelled incorrectly?\n"
        + "(a)Wrong\n(b)Incorrectly\n"
        + "(c)Dictionary\n(d)Supercalifragilisticexpialidocious\n"; // Question
    // 4
    final String q5 = "5.)When will water stop running down hill?\n"
        + "(a)When it stops Rainning\n(b)When it reaches the bottom\n"
        + "(c)It Never Stops\n(d)All The Above\n"; // Question
    // 5
    final String q6 = "6.)What falls down but never breaks?\n"
        + "(a)The Moon\n(b)The Sun\n(c)Mirror\n(d)Nightfall\n"; // Question 6
    final String q7 = "7.)What goes up and never comes down?\n"
        + "(a)Your Age\n(b)Flowers\n(c)Tree's\n(d)Volcano\n"; // Question 7
    final String q8 =
        "8.)I can be crack, I can be played, I can be made,  and I can be told. What am I?\n"
            + "(a)Eggs\n(b)Glass\n(c)A Joke\n(d)A Frog\n"; // Question 8
    final String q9 =
        "9.)I'm lighter than a feather, "
        + "but even the world's strongest men can't hold me for more than a few minutes. "
        + "What Am I??\n"
            + "(a)Breath\n(b)Dumbbells\n(c)GPA\n(d)A Plane\n"; // Question 9
    final String q10 =
        "10.)Those who make it, have no neeed for it. Those who buy it, have no use for it. "
            + "Those who use it can neither see nor feel it. What is it?\n"
            + "(a)Money\n(b)A Coffin\n(c)The Rich People\n(d)Water\n"; // Question 10
    Question[] questions = { // [] means an array of question
        new Question(q1, "c"), // Question object, () pass in a prompt and an answer.
        new Question(q2, "b"), new Question(q3, "a"), new Question(q4, "b"), new Question(q5, "b"),
        new Question(q6, "d"), new Question(q7, "a"), new Question(q8, "c"), new Question(q9, "a"),
        new Question(q10, "b")};
    takeTest(questions); // take the test

    /*
     * Operator Precedence: When two operators share an operand the operator with the higher
     * precedence goes first. For example, 1 + 2 * 3 is treated as 1 + (2 * 3). Whereas 1 * 2 + 3 is
     * treated as (1 * 2) + 3 since multiplication has a higher precedence than addition. Therefore,
     * we can use these with other operands such as : 1 ( lowest) = assignment , where 16(highest) =
     * access array, element access, object member.
     */
    /*
     * Variable and Scope: A Variable is a container that holds values. Instance variables Any
     * method in the class definition can access these variables Parameter variables Only the method
     * where the parameter appears can access these variables. This is how information is passed to
     * the object. Local variables Only the method where the parameter appears can access these
     * variables. These variables are used to store intermediate results. A Scope means the variable
     * is available when the variable was declared.
     */

  }

  /*
   * This next lines of code starts with a header, that enables the user to take the test, returning
   * nothing. Method: takeTest() is going to take 1 parameter.
   */
  
  /**
   * Questions are being asked, and questions is the counter.
   * @param questions is the variable that are correct. 
   */
  public static void takeTest(Question[] questions) {

    while (true) { // asking the user every question if right or wrong, incrementing using a loop.
      int score = 0; // start at zero points
      @SuppressWarnings("resource")
      Scanner keyboardInput = new Scanner(System.in); // user input, import the scanner file.

      for (int i = 0; i < questions.length; i++) { /*
       * i++ is an increment for every correct answer
       * you get. using for loop to cycle through every
       * question and answer. starting at 0.
       */
        System.out.println(questions[i].prompt);

        String answer;

        boolean x = false; // setting x to false
        @SuppressWarnings("unused")
        boolean again;

        do { // using do/while loop, if the answer is incorrect the program will stop.
          System.out.println("Type An Answer Here: ");
          answer = keyboardInput.nextLine();// calling answer inside our loop.

          again = false; // repeat the question, if invalid answer is enter.
          switch (answer.toLowerCase()) { // A {Switch} statement, that specifies variables to test
            // for a value.
            case "a": // case compares the value of switch variables.
              System.out.println(); // String that will be print, for each case.
              x = true; //
              break; /* break is used as the last statement in each case. 
              It can be used to terminate a case.*/
            case "b":
              System.out.println();
              x = true;
              break;
            case "c":
              System.out.println();
              x = true;
              break;
            case "d":
              System.out.println();
              x = true;
              break;
            default: // if all cases are incorrect
              System.out.println("Invaild Answer!");
              x = false;
              again = true;
              break;

          }
        } while (x == false); // then x is false.

        questions[i].isCorrect = false; // setting boolean to false as default.
        if (answer.equals(questions[i].answer)) {
          // checking if the questions are correct. adding a score if its correct.
          score++;

          questions[i].isCorrect = true; // setting boolean to true.

        }

      }
      /*
       * Casting is taking an Object of one particular type and “turning it into” another Object
       * type.
       */

      double percentage = (double) score / 10; // Casting from a/b to a%. from int to double.
      // (correct answer / 10) = 0.0
      percentage = percentage * 100; // multiple(*) by 100 gives us our whole number.


      System.out.println("You Answer Correctly: " + score + "/" + questions.length); // overall
      // score
      // (success / total).
      System.out.println("Overall Score: " + percentage + "%"); // print out the overall score in
      // percentage(%).

      for (int i = 0; i < questions.length; i++) { // for loop that compares to true or false.

        // if statement, that shows which question were incorrect.
        if (questions[i].isCorrect == true) {
          System.out.println(i + 1 + " Correct!"); 
        } // shows you what questions are correct.

        if (questions[i].isCorrect == false) { // == is comparing/checking if the correct answer are
          // true. if not it is compare to false.
          System.out.println(i + 1 + " Wrong!"); // prints "wrong" on incorrect questions.
        }

      }
    }
  }
}