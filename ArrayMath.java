import java.util.Scanner;
/*Kevin Mak COP2006 Introduction to Programming
 * This class doesn't do anything special, other than meeting the requirements for the project.
 *One-dimensional array. 
 *Finding the smallest values in an array. 
 *Get sum of the values in an array using an accumulator.
 *search an array and identify the index where a value was found.
 *Exception Handling
 * Using do/while loop for user to input again and again, until the exception is met.
 */

public class ArrayMath {
  
  /**
   * arrayMath2 holds simply array math, for a one-dimensional array.
   * also, holds other array requirements.
   *will be called by main.
   */
  public void arrayMath2() {
    double[] values = {81,52,33,95,18,4,7};
    double smallest = values[0];

    int[] nums = {81,52,33,95,18,4,7};
    int sum = 0;

    for (int i = 0; i < values.length; i++) {
      if (values[i] < smallest) {
        smallest = values[i];
      }

    }
    System.out.println("\n\nThe smallest value is: " + smallest);

    for (int i : nums) { //enhanced for/loop again.
      sum += i;
    }

    System.out.println("The sum of these numbers is: " + sum);

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int x = 1;
    do { //goes through a loop, to input the right numbers.
      try { //ENTER INPUTS
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();
        int pop = n1 / n2;
        System.out.println(pop);
        x = 2;
      } catch (Exception e) {
        System.out.println("You can't do that!");
      }
    } while (x == 1);
  }
  
  {
    final int[] box = { 2, 4, 6, 8, 10, 12, 14 };
 
    final int lower = 0;
    final int upper = 16;
    boolean foundElement;
    int target;

    System.out.println("Searching for numbers in an array.");
    for (target = lower; target <= upper; target++) { 
      System.out.print("\nIs " + target + " in the array? ");
      foundElement = false;
      for (int index = 0; (index < box.length && !foundElement); index++) {
        foundElement = (box[index] == target);
        if (foundElement) {
          System.out.printf("Yes! %d was found at index [%d]", target, index);
        }                       
      }
      if (!foundElement) {
        System.out.printf(" Not found");    
      }
    }
  }
}
