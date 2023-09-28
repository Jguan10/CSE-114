// This program takes the weight of the package and gives you the cost to ship

import java.util.Scanner;
public class PackageCost {
    public static void main(String[] args) {
        double weight; // Declare weight variable
        System.out.println("Enter weight of package: ");
        Scanner userInput = new Scanner(System.in);
        weight = userInput.nextDouble(); // Assign value to weight variable

        // Package weighs 0-1
        if (weight > 0 && weight <= 1) {
            System.out.println("The package weighs " + weight
                    + " pounds and will be shipped for 3.5");
        }

        // Package weighs 1-3
        if (weight > 1 && weight <= 3) {
            System.out.println("The package weighs " + weight
                    + " pounds and will be shipped for 5.5");
        }

        // Package weighs 3-10
        if (weight > 3 && weight <= 10) {
            System.out.println("The package weighs " + weight
                    + " pounds and will be shipped for 8.5");
        }

        // Package weighs 10-20
        if (weight > 10 && weight <= 20) {
            System.out.println("The package weighs " + weight
                    + " pounds and will be shipped for 10.5");
        }

        // Invalid
        if (weight > 20) {
            System.out.println("The package is too heavy to be shipped.");
        }
        else if (weight < 0) {
            System.out.println("Invalid input.");
        }
    }
}