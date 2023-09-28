// This program is used to test object class LinearEquation

import java.util.Scanner;

public class LinearEquationTest {
    public static void main(String[] args) {

        // Declare variables and read user input
        Scanner userInput = new Scanner(System.in);
        LinearEquation le1 = new LinearEquation(0,0,0,0,0,0);
        System.out.println("Input values for a b c d e f: ");
        double a = userInput.nextDouble();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();
        double d = userInput.nextDouble();
        double e = userInput.nextDouble();
        double f = userInput.nextDouble();

        // Set values to arguments
        le1.setA(a);
        le1.setB(b);
        le1.setC(c);
        le1.setD(d);
        le1.setE(e);
        le1.setF(f);

        // Check if solvable
        if (le1.isSolvable()) {
            System.out.println("X is " + le1.getX() + " and Y is " + le1.getY());
        }
        else {
            System.out.println("The equation has no solutions");
        }
    }
}
