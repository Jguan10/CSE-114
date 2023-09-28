// This program tests the Class Rectangle

public class RectangleTest {
    public static void main(String[] args) {

        // Declare and initialize object
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5,35.9);

        // Display results
        System.out.println("The width of Rectangle 1 is: " + r1.width);
        System.out.println("The height of Rectangle 1 is: " + r1.height);
        System.out.println("The area of Rectangle 1 is: " + r1.getArea());
        System.out.println("The perimeter of Rectangle 1 is: " + r1.getPerimeter());
        System.out.println("The width of Rectangle 2 is: " + r2.width);
        System.out.println("The height of Rectangle 2 is: " + r2.height);
        System.out.println("The area of Rectangle 2 is: " + r2.getArea());
        System.out.println("The perimeter of Rectangle 2 is: " + r2.getPerimeter());
    }
}
