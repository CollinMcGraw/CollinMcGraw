import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        double num1 = 0.0;
        double num2 = 0.0;

        while (!validInput) {
            System.out.print("Enter the first number: ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the scanner buffer
            }
        }

        validInput = false;

        while (!validInput) {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the scanner buffer
            }
        }

        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 < num2) {
            System.out.println("The first number (" + num1 + ") is less than the second number (" + num2 + ").");
        } else {
            System.out.println("The first number (" + num1 + ") is greater than the second number (" + num2 + ").");
        }
    }
}