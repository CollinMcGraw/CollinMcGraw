import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your party affiliation (D, R, I, or Other): ");
        String affiliation = scanner.nextLine().toUpperCase();

        if (affiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        } else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        } else if (affiliation.equals("I")) {
            System.out.println("You get a Free-Spirited Individual!");
        } else {
            System.out.println("You get... uh... something else!");
        }
    }
}