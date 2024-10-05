import java.util.Random;
import java.util.Scanner;

public class S4E1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two random integers between 1 and 100
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;

        // Prompt the user to enter the sum of the two integers
        System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
        int userAnswer = scanner.nextInt();

        // Check if the user's answer is correct
        if (userAnswer == num1 + num2) {
            System.out.println("Correct! " + num1 + "+" + num2 + " is equal to " + userAnswer + "!");
            System.out.println("Good job!");
        } else {
            System.out.println("Oh no! " + (num1 + num2) + " is not equal to " + (userAnswer) + "!");
            System.out.println("Keep practicing!");
        }

        scanner.close();
    }
}