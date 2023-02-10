import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        
        while (true) {
            try {
                System.out.print("Enter first number: ");
                num1 = 75;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        while (true) {
            try {
                System.out.print("Enter second number: ");
                num2 = 45;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        input.close();
        
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        } else {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
    }
}
