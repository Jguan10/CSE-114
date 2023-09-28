public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String toString() {
        return "The radius is: " + radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
