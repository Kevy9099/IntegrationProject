import java.util.Scanner;

/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * This class is calcuting to find the smallest vaule in an array.
 * Getting the sum of the values in an array using an accumulator.
 * Using do/while loop for user to input again and again, until the exception is met.
 * The logic continues to read a user input and loops for every new input.
 */

public class Math {
    Scanner input = new Scanner(System.in);

    public void calculator() {

        System.out.println("Enter first number (0.0): ");
        double first = input.nextInt();
        System.out.println("Enter second number (0.0): ");
        double second = input.nextInt();
        System.out.println("Enter an Operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.println("Error! operator is not correct");
                return;

        }
        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}
