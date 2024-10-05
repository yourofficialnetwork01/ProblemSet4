import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random two-digit lottery number
        int lottery = rand.nextInt(100);

        // Prompt the user to enter a two-digit number
        System.out.print("Enter your lottery pick (two digits): ");
        int userPick = scanner.nextInt();

        // Extract digits from the lottery number
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Extract digits from the user's pick
        int userDigit1 = userPick / 10;
        int userDigit2 = userPick % 10;

        System.out.println("The lottery number is " + (lottery < 10 ? "0" + lottery : lottery));

        // Check the user's input against the lottery number
        if (userPick == lottery) {
            System.out.println("Exact match: you win $10,000!");
        } else if ((userDigit1 == lotteryDigit2 && userDigit2 == lotteryDigit1)) {
            System.out.println("Match all digits: you win $3,000!");
        } else if (userDigit1 == lotteryDigit1 || userDigit1 == lotteryDigit2 || userDigit2 == lotteryDigit1 || userDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000!");
        } else {
            System.out.println("Sorry: no match.");
        }

        scanner.close();
    }
}