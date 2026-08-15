import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Student Grade Calculator ---\n");

        int englishMarks, urduMarks, computerMarks, obtainedMarks;
        int totalMarks = 300;
        float percentage;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Obtained Marks of English (out of 100): ");
        englishMarks = input.nextInt();

        System.out.println("Enter Obtained Marks of Urdu (out of 100): ");
        urduMarks = input.nextInt();

        System.out.println("Enter Obtained Marks of Computer (out of 100): ");
        computerMarks = input.nextInt();



        if (englishMarks <= 100 && urduMarks <= 100 && computerMarks <= 100 &&
            englishMarks > 0 && urduMarks > 0 && computerMarks > 0) {

            obtainedMarks = englishMarks + urduMarks + computerMarks;
            percentage = ((float) obtainedMarks / totalMarks) * 100;

            System.out.println("Your obtained marks : " + obtainedMarks + "/300");
            System.out.println("Your percentage: " + percentage + "%");

            if (percentage >= 90) {
                System.out.println("-- Congratulations, your grade is A+ --");
            } else if (percentage >= 80) {
                System.out.println("-- Your grade is A --");
            } else if (percentage >= 70) {
                System.out.println("-- Your grade is B --");
            } else if (percentage >= 60) {
                System.out.println("-- Your grade is C --");
            } else if (percentage >= 50) {
                System.out.println("-- Your grade is D --");
            } else if (percentage < 50) {
                System.out.println("-- You're Fail --");
            }

        } else {
            System.out.println("--- Invalid Number Input ---");
        }

    }
}