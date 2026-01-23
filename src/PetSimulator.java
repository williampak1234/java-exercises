import java.util.Scanner;

public class PetSimulator {
    private final static Scanner scanner = new Scanner(System.in);
    private String name;
    private int hungerLevel, energyLevel;

    public PetSimulator(String name) {
        this.name = name;
        hungerLevel = 100;
        energyLevel = 100;
    }

    private static String printMenu() {
        System.out.println("Welcome to Pet Simulator!");
        System.out.println("What would you like to name your pet?");
        return scanner.nextLine();
    }

    public void feed() {
        if(hungerLevel==100) {
            System.out.println(name + " is already full and will not eat anymore food.");
            return;
        }
        hungerLevel += 20;
    }

    public void doTrick() {
        if(energyLevel<=20) {
            System.out.println(name + "is too exhausted and will not do any tricks.");
            return;
        }
        System.out.println("*" + name + " spins in a circle and rolls over on the ground*");
        energyLevel -= 20;
    }



    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        String petName = printMenu();
        PetSimulator pet1 = new PetSimulator(petName);

    }
}
