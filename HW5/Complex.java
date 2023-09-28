// Jiaxiong Guan
// 114548063

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 1;
        imaginaryPart = 1;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public String toString() {
        return "(" + realPart + "," + imaginaryPart + ")";
    }

    public static String getAddition (Complex c1, Complex c2) {
        double realAdd = c1.getRealPart() + c2.getRealPart();
        double imagineAdd = c1.getImaginaryPart() + c2.getImaginaryPart();
        return "(" + realAdd + "," + imagineAdd + ")";
    }

    public static String getSubtraction (Complex c1, Complex c2) {
        double realSub = c1.getRealPart() - c2.getRealPart();
        double imagineSub = c1.getImaginaryPart() - c2.getImaginaryPart();
        return "(" + realSub + "," + imagineSub + ")";
    }
}
