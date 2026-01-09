import java.util.Scanner;

public class DNAProteinValidation {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean validSequence = false;
    private static String sequence;
    private static boolean keepTesting = true;

    /**
     * Gets and returns user input for DNA Sequence
     */
    private static String getSequence() {
        System.out.println("Please enter in user's DNA sequence: ");
        sequence = scanner.nextLine();
        validSequence = validateSequence(sequence);

        while(!validSequence) {
            System.out.println("\nThe only valid inputs are A C G and T");
            System.out.println("Please enter in user's DNA sequence: ");
            sequence = scanner.nextLine();
            validSequence = validateSequence(sequence);
        }

        return sequence;
    }

    /**
     * Ensures only A, C, G, and T are inputted as DNA sequences to avoid errors.
     */
    private static boolean validateSequence(String DNASequence) {
        for(int i = 0; i<DNASequence.length(); i++) {
            char c = DNASequence.charAt(i);
            if(c!='A' && c!= 'C' && c!='G' && c!='T') {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks to see if the DNA is a protein
     */
    private static boolean checkIfProtein(String DNASequence) {
        if(DNASequence.substring(0,3).equals("ATG") && DNASequence.substring(DNASequence.length()-3, DNASequence.length()).equals("TGA") && DNASequence.length() % 3 == 0) {
            return true;
        }

        return false;
    }

    /**
     * Prints out if DNA strand is protein or not
     */
    private static void printResult(boolean isProtein) {
        if(isProtein) {
            System.out.println("The DNA strand is a protein.");
        }
        else {
            System.out.println("The DNA strand is not a protein.");
        }
    }



    public static void main(String[] args) {

        while(keepTesting) {
            String userDNASequence = getSequence();
            boolean isProtein = checkIfProtein(userDNASequence);
            printResult(isProtein);
            System.out.println("\nWould you like to test another strand?: ");
            if (scanner.nextLine().equals("Y")) {
                keepTesting = true;
            }
            else {
                keepTesting = false;
            }

        }

    }
}
