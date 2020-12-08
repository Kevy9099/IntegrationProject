import java.util.Scanner;

/**
 * Kevin Mak COP2006 Introduction to Programming
 * A class to play a trivia quiz, the user input a string = a, b, c, d.
 */

public class PlayQuiz {

    public void funQuiz() {
        String input = getString();

        String output = input.substring(0, 1).toUpperCase() + input.substring(1);

        System.out.println("Hello, " + output + ", Welcome To My Riddle Game! "); // The Greeting

        final String q1 = "1.)What goes up when the rain comes down?\n"
                + "(a)Your Shadow\n(b)The Sun\n(c)An Umbrella\n(d)Clouds\n";
        final String q2 =
                "2.)What starts with a \"T\", ends with a \"T\", and has \"T\" in it, What am I?\n"
                        + "(a)Bowl\n(b)Teapot\n(c)That\n(d)Taunt\n";
        final String q3 =
                "3.)What can point in every direction, but can't reach the destination by itself?\n"
                        + "(a)Compass\n(b)Plate\n(c)Stars\n(d)UFO\n";
        final String q4 = "4.)Which word in the dictionary is spelled incorrectly?\n"
                + "(a)Wrong\n(b)Incorrectly\n"
                + "(c)Dictionary\n(d)Supercalifragilisticexpialidocious\n";
        final String q5 = "5.)When will water stop running down hill?\n"
                + "(a)When it stops Rainning\n(b)When it reaches the bottom\n"
                + "(c)It Never Stops\n(d)All The Above\n";
        final String q6 = "6.)What falls down but never breaks?\n"
                + "(a)The Moon\n(b)The Sun\n(c)Mirror\n(d)Nightfall\n";
        final String q7 = "7.)What goes up and never comes down?\n"
                + "(a)Your Age\n(b)Flowers\n(c)Tree's\n(d)Volcano\n";
        final String q8 =
                "8.)I can be crack, I can be played, I can be made,  and I can be told. What am I?\n"
                        + "(a)Eggs\n(b)Glass\n(c)A Joke\n(d)A Frog\n";
        final String q9 =
                "9.)I'm lighter than a feather, "
                        + "but even the world's strongest men can't hold me for more than a few minutes. "
                        + "What Am I??\n"
                        + "(a)Breath\n(b)Dumbbells\n(c)GPA\n(d)A Plane\n";
        final String q10 =
                "10.)Those who make it, have no neeed for it. Those who buy it, have no use for it. "
                        + "Those who use it can neither see nor feel it. What is it?\n"
                        + "(a)Money\n(b)A Coffin\n(c)The Rich People\n(d)Water\n";
        Question[] questions = {
                new Question(q1, "c"),
                new Question(q2, "b"), new Question(q3, "a"), new Question(q4, "b"), new Question(q5, "b"),
                new Question(q6, "d"), new Question(q7, "a"), new Question(q8, "c"), new Question(q9, "a"),
                new Question(q10, "b")};
        takeTest(questions);


    }

    private String getString() {
      return getUsersName();
    }

    private String getUsersName() {
        Scanner stdin = new Scanner(System.in);

        String usersName;

        System.out.println("Please enter your name: ");

        usersName = stdin.nextLine();
        return usersName;
    }

    /**
     * Questions are being asked, and questions is the counter.
     *
     * @param questions is the variable that are correct.
     */
    public static void takeTest(Question[] questions) {

        while (true) {
            int score = 0;
            Scanner keyboardInput = new Scanner(System.in);

          for (Question question : questions) {
            System.out.println(question.prompt);

            String answer;

            answer = getString(keyboardInput);

            question.isCorrect = false;
            if (answer.equals(question.answer)) {

              score++;

              question.isCorrect = true;

            }

          }

            double percentage = (double) score / 10;
            percentage = percentage * 100;


            System.out.println("You Answer Correctly: " + score + "/" + questions.length);

            System.out.println("Overall Score: " + percentage + "%");

            for (int i = 0; i < questions.length; i++) {

                if (questions[i].isCorrect) {
                    System.out.println(i + 1 + " Correct!");
                }

                if (!questions[i].isCorrect) {
                    System.out.println(i + 1 + " Wrong!");
                }

            }
        }
    }

    private static String getString(Scanner keyboardInput) {
        String answer;
        answer = getAnswer(keyboardInput);
        return answer;
    }

    private static String getAnswer(Scanner keyboardInput) {
        String answer;
        boolean x;
        do {
            System.out.println("Type An Answer Here: ");
            answer = keyboardInput.nextLine();

            switch (answer.toLowerCase()) {
                case "a":
                case "b":
                case "c":
                case "d":
                    System.out.println();
                    x = true;
                    break;
                default:
                    System.out.println("Invalid Answer!");
                    x = false;
                    break;

            }
        } while (!x);
        return answer;
    }
}