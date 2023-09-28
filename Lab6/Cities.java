
import java.util.Scanner;
public class Cities {
    public static void main(String[] args) {

        // Collect user data and assign to variables
        System.out.println("Enter the first city: ");
        Scanner userInput =  new Scanner(System.in);
        String city0 = userInput.nextLine();
        System.out.println("Enter the second city: ");
        String city1 = userInput.nextLine();
        System.out.println("Enter the third city: ");
        String city2 = userInput.nextLine();
        System.out.println("The cities in alphabetical order are:");

        // First city
        if (city0.compareTo(city1) < 0 && city0.compareTo(city2) < 0) {
            System.out.println("1. " + city0);
            if (city1.compareTo(city2) < 0) {
                System.out.println("2. " + city1);
                System.out.println("3. " + city2);
            }
            else {
                System.out.println("2. " + city2);
                System.out.println("3. " + city1);
            }
        }

        // Second City
        if (city1.compareTo(city0) < 0 && city1.compareTo(city2) < 0) {
            System.out.println("1. " + city1);
            if (city0.compareTo(city2) < 0) {
                System.out.println("2. " + city0);
                System.out.println("3. " + city2);
            }
            else {
                System.out.println("2. " + city2);
                System.out.println("3. " + city0);
            }
        }

        // Third City
        if (city2.compareTo(city1) < 0 && city2.compareTo(city0) < 0) {
            System.out.println("1. " + city2);
            if (city0.compareTo(city1) < 0) {
                System.out.println("2. " + city0);
                System.out.println("3. " + city1);
            }
            else {
                System.out.println("2. " + city1);
                System.out.println("3. " + city0);
            }
        }
    }
}