// This program is the object for the Quadratic Equation
public class QuadraticEquation {
    // Declare variables a,b,c
    private double a = 0;
    private double b = 0;
    private double c = 0;

    // Constructor without arguments
    public QuadraticEquation() {
    }

    // Constructor with arguments
    public QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }

    // Getter method for a
    public double getA() {
        return a;
    }

    // Setter method for a
    public void setA(double newA) {
        a = newA;
    }

    // Getter method for b
    public double getB() {
        return b;
    }

    // Setter method for b
    public void setB(double newB) {
        b = newB;
    }

    // Getter method for c
    public double getC() {
        return c;
    }

    // Setter method for c
    public void setC(double newC) {
        c = newC;
    }

    // Method to calculate discriminant
    public double getDiscriminant() {
        return (getB() * getB()) - (4.0 * getA() * getC());
    }

    public double getRoot1() {
        return (-getB() + Math.pow(getDiscriminant(),.5)) / 2.0;
    }

    public double getRoot2() {
        return (-getB() - Math.pow(getDiscriminant(),.5)) / 2.0;
    }

}
