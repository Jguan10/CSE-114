// This program is the object class LinearEquation

public class LinearEquation {

    // Declare variables
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;
    private double e = 0;
    private double f = 0;

    // Constructor with arguments
    LinearEquation(double newA, double newB, double newC,
                   double newD, double newE, double newF) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    // Setters and getters
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getE() {
        return e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getF() {
        return f;
    }

    // Method to determine if solvable
    public boolean isSolvable() {
        if((a * d) - (b * c) < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Method to compute x
    public double getX() {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }


    // Method to compute y
    public double getY() {
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}
