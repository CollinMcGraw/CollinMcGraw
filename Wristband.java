import java.util.Scanner;

public class Wristband {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 21) {
            System.out.println("You get a wristband!");
        } // No "else" here, as intended in prompt
    }
}