// This program will take the initial velocity, final velocity, and time to calculate average acceleration
import java.util.Scanner;
public class AverageAcceleration {
    public static void main(String[] args) {
        double v0; // Initial velocity
        double v1; // Final velocity
        double t; // Time
        double a; // Acceleration

        // Input values for variables
        System.out.println("Input values for initial velocity, " +
                "final velocity, and time line by line here: ");
        Scanner userInput = new Scanner(System.in);
        v0 = userInput.nextDouble(); // Assign value to initial velocity
        v1 = userInput.nextDouble(); // Assign value to final velocity
        t = userInput.nextDouble(); // Assign value to time
        a = (v1 - v0) / t ;
        System.out.println("Average acceleration with initial velocity " + v0 +
                " and with final velocity " + v1 + " over " + t + " seconds is " + a);
    }
}