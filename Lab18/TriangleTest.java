
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter if the shape is filled (True or False): ");
        boolean filled = userInput.nextBoolean();
        System.out.println("Please enter 3 sides: ");
        double s1 = userInput.nextDouble();
        double s2 = userInput.nextDouble();
        double s3 = userInput.nextDouble();
        Triangle t1 = new Triangle(s1, s2, s3);
        System.out.println("Please enter a color: ");
        String color = userInput.nextLine();
        t1.setColor(color);
        t1.setFilled(filled);
        System.out.println(t1.toString());
    }
}
