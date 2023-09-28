import java.util.Scanner;
public class DistanceFormula {
    public static void main(String[] args) {

        // Declare variables
        double x1;
        double y1;
        double x2;
        double y2;
        double formula;

        System.out.println("Input the first set of points, " +
                "provide x1 value then y1 value: ");
        Scanner userInput = new Scanner(System.in);
        x1 = userInput.nextDouble();
        y1 = userInput.nextDouble();
        System.out.println("Input the second set of points, " +
                "provide x2 value then y2 value: ");
        x2 = userInput.nextDouble();
        y2 = userInput.nextDouble();

        // Computation
        double xdiff = x2 - x1;
        double ydiff = y2 - y1;
        double xsquared = Math.pow(xdiff,2);
        double ysquared = Math.pow(ydiff,2);
        double xplusy = xsquared + ysquared;
        double distance = Math.pow(xplusy,0.5);
        System.out.println("The distance between (" + x1 + "," + y1 +
                ") and (" + x2 + "," + y2 + ") is " + distance);
    }
}