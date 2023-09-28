public class CircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(7);
        if(c1.compareTo(c2) > 0) {
            System.out.println("c1 is larger");
        }
        else if(c1.compareTo(c2) < 0) {
            System.out.println("c2 is larger");
        }
        else if(c1.compareTo(c2) == 0) {
            System.out.println("The circles have equal area");
        }
    }
}
