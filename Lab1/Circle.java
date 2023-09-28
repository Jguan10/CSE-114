// This program will take the radius of the circle and compute the area and perimeter
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        double radius; // Radius of circle
        double area; // Area of circle
        double perimeter; // Perimeter of circle
        double pi = 3.14;
        System.out.println("Enter the radius: "); // Enter value of radius
        Scanner stdin = new Scanner(System.in);
        radius = stdin.nextDouble(); // Assign value to radius
        area = radius * radius * pi; // Compute area of circle
        perimeter = 2.0 * radius * pi; // Compute perimeter of circle
        System.out.println("Perimeter of circle with radius " + radius + " is " + perimeter); // Display perimeter of circle
        System.out.println("Area of circle with radius " + radius + " is " + area); // Display area of circle
    }
}
