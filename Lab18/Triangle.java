public class Triangle extends GeometricObject {
    double s1 = 1.0;
    double s2 = 1.0;
    double s3 = 1.0;

    public Triangle() {
    }

    public Triangle(double newS1, double newS2, double newS3) {
        s1 = newS1;
        s2 = newS2;
        s3 = newS3;
    }

    public double getArea() {
        double s = s1 + s2 + s3;
        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public String toString() {
        return "Triangle: side 1 = " + s1 + " side 2 = " + s2 + " side 3 = " + s3;
    }
}
