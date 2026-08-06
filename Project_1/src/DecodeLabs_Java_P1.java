import java.util.InputMismatchException;
import java.util.Scanner;

public class DecodeLabs_Java_P1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);

        int userNumber = 0;

        try {


            do {

                System.out.println("Guess my number (1-100): ");
                userNumber = input.nextInt();

                if (userNumber == myNumber) {
                    System.out.println("WOOHOOO... Correct!");
                    break;
                } else if (userNumber > myNumber) {
                    System.out.println("Your number is LARGER than mine");
                } else {
                    System.out.println("Your number is SMALLER than mine");
                }

            } while (userNumber >= 0);

        } catch (InputMismatchException e) {
            System.out.println("--- Invalid Number Entered ---");
        }

        System.out.println("My number was: " + myNumber);

    }
}