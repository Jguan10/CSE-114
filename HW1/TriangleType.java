
import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        int side0; // Declare variable for first side
        int side1; // Declare variable for second side
        int side2; // Declare variable for third side
        System.out.println("Input 3 measurements for the 3 sides of the triangle: ");
        Scanner userInput = new Scanner(System.in);
        side0 = userInput.nextInt();
        side1 = userInput.nextInt();
        side2 = userInput.nextInt();

        // Invalid Input
        if (!(side0 + side1 > side2 && side0 + side2 > side1 && side1 + side2 > side0)) {
            System.out.println("Invalid Input: Cannot Create Triangle");
            System.exit(0);
        }
        if (side0 < 0 || side1 < 0) {
            System.out.println("Invalid Input: Negative Numbers");
            System.exit(0);
        }
        else if (side2 < 0) {
            System.out.println("Invalid Input: Negative Numbers");
            System.exit(0);
        }

        // Equilateral
        if (side0 == side1 && side0 == side2) {
            System.out.println("Side 1: " + side0 + "\nSide 2: " + side1 +
                    "\nSide 3: " + side2 + "\nTriangle Type: Equilateral ");
        }

        // Isosceles
        if ((side0 == side1 || side0 == side2)
                && !(side0 == side1 && side0 == side2)) {
            System.out.println("Side 1: " + side0 + "\nSide 2: " + side1 +
                    "\nSide 3: " + side2 + "\nTriangle Type: Isosceles ");
        }
        else if ((side1 == side2) && !(side0 == side1 && side0 == side2)) {
            System.out.println("Side 1: " + side0 + "\nSide 2: " + side1 +
                    "\nSide 3: " + side2 + "\nTriangle Type: Isosceles ");
        }

        // Scalene
        if (side0 != side1 & side0 != side2 & side1 != side2) {
            System.out.println("Side 1: " + side0 + "\nSide 2: " + side1 +
                    "\nSide 3: " + side2 + "\nTriangle Type: Scalene ");
        }
    }
}
