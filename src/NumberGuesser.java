import java.util.Random;
import java.util.Scanner;
public class NumberGuesser {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isRunning = true;
    /**
     * Print the Menu
     */
    public static int printMenu() {
        System.out.println("""
                Welcome to Number Guesser!
                
                1) Play
                2) Exit
                """);

        int userMenuChoice = scanner.nextInt();
        scanner.nextLine();

        while (userMenuChoice != 1 && userMenuChoice != 2) {
            System.out.println("The only valid input is 1 and 2, please enter a valid input.");
            userMenuChoice = scanner.nextInt();
            scanner.nextLine();
        }

        return userMenuChoice;
    }

    /**
     * Plays the game after user chooses 1
     */
    public static void execute() {
    }

    public static void main(String[] args) {
        while (isRunning) {
            int menuChoice = printMenu();

        }

    }
}