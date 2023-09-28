// Jiaxiong Guan
// 114548063

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public boolean contains(double x, double y) {
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(x,y)) {
            return true;
        }
        else
            return false;
    }

    public boolean contains(Circle2D circle) {
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x + radius, circle.y)
                && distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x - radius, circle.y)
                && distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x, circle.y - radius)
                && distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x, circle.y + radius)) {
            return true;
        }
        return false;
    }

    public boolean overlaps(Circle2D circle) {
        int counter = 0;
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x + radius, circle.y)) {
            counter++;
        }
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x - radius, circle.y)) {
            counter++;
        }
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x, circle.y - radius)) {
            counter++;
        }
        if(distanceFormula(this.x + radius, this.y) > distanceFormula(circle.x, circle.y + radius)) {
            counter++;
        }
        if(0 < counter && counter < 4) {
            return true;
        }
        else
            return false;
    }

    public double distanceFormula(double x1, double y1) {
        double xPart = Math.pow(x - x1, 2.0);
        double yPart = Math.pow(y - y1, 2.0);
        return Math.pow(xPart + yPart, 0.5);
    }
}
