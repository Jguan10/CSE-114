import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {

        // Declare variables
        double a;
        double b;
        double c;
        double discriminant;
        double root1;
        double root2;

        System.out.println("Enter a,b,c:");
        Scanner userInput = new Scanner(System.in);
        a = userInput.nextDouble();
        b = userInput.nextDouble();
        c = userInput.nextDouble();
        discriminant = Math.pow(b,2) - 4.0 * a * c;

        // Positive discriminant, 2 roots
        if (discriminant > 0) {
            root1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
            root2 = (-b - Math.pow(discriminant,0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2 + ".");
        }

        // Zero discriminant, 1 root
        if (discriminant == 0) {
            root1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
            System.out.println("The equation has one root: " + root1 + ".");
        }

        // Negative discriminant, no roots
        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}