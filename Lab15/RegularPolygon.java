// This program is the object class for a regular polygon

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // Default constructor with no arguments
    RegularPolygon() {
    }

    // Constructor with specified sides and at 0,0
    RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
    }

    // Constructor with specified sides and coordinates
    RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    // Getter for n
    public int getN() {
        return n;
    }

    // Setter for n
    public void setN(int n) {
        this.n = n;
    }

    // Getter for side
    public double getSide() {
        return side;
    }

    // Setter for side
    public void setSide(double side) {
        this.side = side;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return side * n;
    }

    public double getArea() {
        return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
    }
}
