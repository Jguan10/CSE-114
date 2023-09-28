// This program takes the user input and calculates the roots using Class QuadraticEquation

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        QuadraticEquation qe1 = new QuadraticEquation(0,0,0);
        System.out.println("Input value for a, b, and c: ");
        double a = userInput.nextDouble();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();
        qe1.setA(a);
        qe1.setB(b);
        qe1.setC(c);

        if(qe1.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        }
        if(qe1.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + qe1.getRoot1());
        }
        if(qe1.getDiscriminant() > 0) {
            System.out.println("The equation has two roots: " + qe1.getRoot1() + " and " + qe1.getRoot2());
        }
    }
}
