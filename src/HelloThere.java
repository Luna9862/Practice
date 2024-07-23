import java.util.Scanner;
public class HelloThere {
    public static void main (String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Hello there! How are you doing today? ");

        // The string provided by the user will be assigned to the name variable
        // Scanner will read the input entered by the user
        String hello = scanner.nextLine();

        System.out.println("WOW - Interesting! Tell me more about yourself! ");

        String wow = scanner.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");
    }
}