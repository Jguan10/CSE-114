// This program is to test the object class RegularPolygon

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4,5.6, 7.8);
        System.out.println("The perimeter of polygon 1 is: " + p1.getPerimeter());
        System.out.println("The area of polygon 1 is: " + p1.getArea());
        System.out.println("The perimeter of polygon 2 is: " + p2.getPerimeter());
        System.out.println("The area of polygon 2 is: " + p2.getArea());
        System.out.println("The perimeter of polygon 3 is: " + p3.getPerimeter());
        System.out.println("The area of polygon 3 is: " + p3.getArea());
    }
}
