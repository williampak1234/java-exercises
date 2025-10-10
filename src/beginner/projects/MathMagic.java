package beginner.projects;

public class MathMagic {
    public static void main(String[] args) {
        // This is the original number
        System.out.println("No matter what number you choose, the result will be 3!");
        System.out.println("In order to check, edit the code yourself and check it out!");
        double myNumber = 150000;

        double step1 = myNumber * myNumber;
        double step2 = step1 + myNumber;
        double step3 = step2 / myNumber;
        double step4 = step3 + 17;
        double step5 = step4 - myNumber;
        double step6 = step5 / 6;
        System.out.println(step6);


    }
}
