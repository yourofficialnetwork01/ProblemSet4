import java.util.Scanner;

public class S4E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Determine the number of roots based on the discriminant
        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}