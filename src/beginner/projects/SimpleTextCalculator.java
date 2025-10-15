package beginner.projects;
import java.util.Scanner;

public class SimpleTextCalculator {

    Scanner scanner = new Scanner(System.in);

    public SimpleTextCalculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public int GetFirstNumber() {
        System.out.println("Please enter in the first number: ");
        return scanner.nextInt();
    }

    public int GetSecondNumber() {
        System.out.println("Please enter in the second number: ");
        return scanner.nextInt();
    }

    public String PrintInstructions() {
        scanner.nextLine();

        System.out.println("""
                Please enter in your choice of operation
                
                Your options are:
                Add
                Subtract
                Multiply
                Divide
                Modulo
                
                Please type in the desired operation exactly as written above including capitals:
                """);

        return scanner.nextLine();
    }


    public int RunOperation(int firstNumber,int secondNumber, String operation) {
        int result=0;

            if (operation.equals("Add")) {
                result = add(firstNumber, secondNumber);
            }
            else if (operation.equals("Subtract")) {
                result = subtract(firstNumber, secondNumber);
            }
            else if (operation.equals("Multiply")) {
                result = multiply(firstNumber, secondNumber);
            }
            else if (operation.equals("Divide")) {
                result = divide(firstNumber, secondNumber);
            }
            else if (operation.equals("Modulo")) {
                result = modulo(firstNumber, secondNumber);
            }

        return result;
    }

    public static void main(String[] args) {
        // Creates new instance of calculator
        SimpleTextCalculator myCalculator = new SimpleTextCalculator();

        // Gets values for first and second number
        int firstNum = myCalculator.GetFirstNumber();
        int secondNum = myCalculator.GetSecondNumber();

        // Prints instructions and returns the instructions
        String operationChoice = myCalculator.PrintInstructions();

        // Takes in both numbers and instructions and calculates
        int finalAnswer = myCalculator.RunOperation(firstNum, secondNum, operationChoice);

        // Prints final answer
        System.out.println(finalAnswer);

    }
}
