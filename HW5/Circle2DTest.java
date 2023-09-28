// Jiaxiong Guan
// 114548063

public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        Circle2D c2 = new Circle2D(4,5,10.5);
        Circle2D c3 = new Circle2D(3,5,2.3);

        System.out.println("This is c1's area: " + c1.getArea());
        System.out.println("This is c1's perimeter: " + c1.getCircumference());
        System.out.println("Does c1 contain 3, 3? " + c1.contains(3,3));
        System.out.println("Does c1 contain c2? " + c1.contains(c2));
        System.out.println("Does c1 overlap c3? " + c1.overlaps(c3));
    }
}
