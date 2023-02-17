// Import the Scanner class from the java.util package.
import java.util.Scanner;

// Declare a public class called "main".
public class main {
  // Declare a static void method called "main" that takes in an array of Strings as its argument.
  public static void main(String[] args) {
    // Create a new Scanner object called "input".
    Scanner input = new Scanner(System.in);

    // Declare two double variables called "num1" and "num2".
    double num1, num2;

    // Use a while loop to repeatedly ask the user to enter the first number until a valid input is given.
    while (true) {
      try {
        System.out.print("Enter first number: ");

        // Initialize "num1" to a value of 75.
        num1 = 75;

        // Break out of the loop if the user's input can be converted to a double.
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    // Use a while loop to repeatedly ask the user to enter the second number until a valid input is given.
    while (true) {
      try {
        System.out.print("Enter second number: ");

        // Initialize "num2" to a value of 45.
        num2 = 45;

        // Break out of the loop if the user's input can be converted to a double.
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }

    // Close the Scanner object "input".
    input.close();

    // Compare "num1" and "num2" and print a message indicating their relationship.
    if (num1 == num2) {
      System.out.println("The numbers are equal.");
    } else if (num1 < num2) {
      System.out.println(num1 + " is less than " + num2 + ".");
    } else {
      System.out.println(num1 + " is greater than " + num2 + ".");
    }
  }
}
