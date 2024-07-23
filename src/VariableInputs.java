import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter an integer: ");
        int inputInt = scanner.nextInt();

        System.out.println("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        boolean booleanInput = scanner.nextBoolean();

        System.out.println("Your string is " + inputString);
        System.out.println("Your integer is " + inputInt);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);
    }
}

