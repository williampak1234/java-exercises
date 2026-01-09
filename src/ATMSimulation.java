import java.util.Scanner;
public class ATMSimulation {
    private static final Scanner scanner = new Scanner(System.in);
    private static int currentBalance = 0;
    private static boolean isRunning = true;

    /**
     * Print Menu
     */
    private static int printMenu() {
        System.out.println("""
                Welcome to the ATM
                
                Would you like to
                1) Check Balance
                2) Withdraw
                3) Deposit
                4) Exit
                
                """);
        int menuChoiceReturn = scanner.nextInt();
        scanner.nextLine();

        while (menuChoiceReturn < 1 || menuChoiceReturn > 4) {
            System.out.println("Please enter a valid input (1, 2, 3, or 4");
            menuChoiceReturn = scanner.nextInt();
            scanner.nextLine();
        }

        return menuChoiceReturn;

    }

    /**
     * Get Balance
     */
    private static void getBalance() {
        System.out.println("$" + currentBalance);

    }

    /**
     * Withdrawl
     */
    private static void withdraw() {
        boolean validWithdraw = false;

        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = scanner.nextInt();

        while (withdrawAmount > currentBalance  || withdrawAmount < 0) {
            System.out.println("You can not withdraw more than your balance.");
            System.out.println("How much would you like to withdraw?");
            withdrawAmount = scanner.nextInt();
            scanner.nextLine();

        }

        currentBalance -= withdrawAmount;
        System.out.println("Successfully withdrawn $" + withdrawAmount + ".");


    }

    /**
     * Deposit
     */
    private static void deposit() {
        System.out.println("How much would you like to deposit?: ");
        int depositAmount = scanner.nextInt();
        scanner.nextLine();
        currentBalance += depositAmount;


    }

    /**
     * Exit
     */
    private static void exitProgram() {
        System.out.println("Thanks for banking with us! Have an amazing day!");
        isRunning = false;
    }

    /**
     * Next Step
     */
    private static void nextStep() {
        System.out.println("Is there anything else you need help with today?: (Y/N)");
        String helpOrNot = scanner.nextLine();


        while (!helpOrNot.equals("Y") && !helpOrNot.equals("N")) {
            System.out.println("The only valid input is Y or N");
            System.out.println("Is there anything else you need help with today?: (Y/N)");
            helpOrNot = scanner.nextLine();
        }


        if (helpOrNot.equals("Y")) {
            System.out.println("""
                   
           
                    """);
        }
        else if (helpOrNot.equals("N")){
            exitProgram();
        }

    }

    /**
     * Execute User's Choice
     */
    private static void execute(int number) {
        if (number == 1) {
            getBalance();
        }
        else if (number == 2) {
            withdraw();
        }
        else if (number == 3) {
            deposit();
        }
        else if (number == 4) {
            exitProgram();
        }
    }

    public static void main(String[] args) {
        while (isRunning) {
            int userChoice = printMenu();
            execute(userChoice);
            if (isRunning) {
                nextStep();
            }
        }
    }
}