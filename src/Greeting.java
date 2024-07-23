import java.util.Scanner;
public class Greeting {
    public static void main (String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("What's your name? ");

        // The string provided by the user will be assigned to the name variable
        // Scanner will read the input entered by the user
        String name = scanner.nextLine();

        // Print the greeting message
        System.out.println("Hi " + name);
    }
}