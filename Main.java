import java.util.Scanner;

/**
 * @author Kevin Mak
 * COP2006 Introduction to Programming, 09/03/18
 * this Integration Project objective was to help understand the basic functionality, implementation,
 * and critical thinking in programming. The project performs simple widgets, that imitated a windows widget
 * toolbar. The project was programmed using Java Programming and implemented skills such as Class, Objects,
 * Array, Conditional Loops, User Input, Enhance If-Loop, Inheritance, and Polymorphism.
 */

public class Main {

    /**
     * call other methods.
     *
     * @param args of strings.
     */
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);//new scanner for user input.

        System.out.println("Choose An Option: ");
        System.out.println("1. Quiz Game");
        System.out.println("2. Dice Game");
        System.out.println("3. Clock");
        System.out.println("4. Math");
        System.out.println("5. Calendar");
        System.out.println("6. Zodiac Sign");
        System.out.println("7. Fortune Teller");
        System.out.println("8. Summary");

        int option = stdin.nextInt();

        if (option == 1) {
            PlayQuiz fun = new PlayQuiz() {
            };
            fun.funQuiz(); //Will call playQuiz class.
        } else if (option == 2) {
            PlayDiceGame dice = new PlayDiceGame();
            dice.diceGame(); // will call PlayDiceGame class.
        } else if (option == 3) {

            PlayClock timer = new PlayClock();
            PlayClock timer2 = new PlayClock(5);
            PlayClock timer3 = new PlayClock(5, 13);
            PlayClock timer4 = new PlayClock(5, 13, 43);

            System.out.printf("%s%n", timer.toMilitary());
            System.out.printf("%s%n", timer2.toMilitary());
            System.out.printf("%s%n", timer3.toMilitary());
            System.out.printf("%s%n", timer4.toMilitary());


        } else if (option == 4) {
            Math mint = new Math();
            mint.calculator();
        } else if (option == 5) {
            LocalCalendar time = new LocalCalendar();
            time.calendar();
        } else if (option == 6) {
            Horoscope sign = new Horoscope();
            sign.zodiac();
        }else if (option == 7){
            Horoscope fortune = new Horoscope();
            fortune.askQuestion();
            fortune.zodiacFortune();
        }else if (option == 8) {
            Credits[] end = new Credits[4];
            end[0] = new Idea(); //polymorphism array
            end[1] = new Myself();
            end[2] = new Special();
            end[3] = new EndingGreetings();

            for (int x = 0; x < 4; ++x) {
                end[x].bye();
            }
        } else {
            System.out.println("Choose an option between 1 and 8.");
        }
    }
}