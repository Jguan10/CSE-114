// Jiaxiong Guan
// 114548063

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(numerator,denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void simplify(int newNumerator, int newDenominator) {
        for(int i = 1; i < newDenominator; i++) {
            if(newDenominator % i == 0 && newNumerator % i == 0) {
                numerator = newNumerator / i;
                denominator = newDenominator / i;
            }
        }
    }

    public static String getAddition(Rational r1, Rational r2) {
        int newN1 = r1.numerator * r2.denominator;
        int newN2 = r2.numerator * r1.denominator;
        int newD = r1.denominator * r2.denominator;
        int addN = newN1 + newN2;
        Rational r3 = new Rational(addN,newD);
        return r3.toString();
    }

    public static String getSubtraction(Rational r1, Rational r2) {
        int newN1 = r1.numerator * r2.denominator;
        int newN2 = r2.numerator * r1.denominator;
        int newD = r1.denominator * r2.denominator;
        int subN = newN1 - newN2;
        Rational r3 = new Rational(subN,newD);
        return r3.toString();
    }

    public static String getMultiplication(Rational r1, Rational r2) {
        int newN = r1.numerator * r2.numerator;
        int newD = r1.denominator * r2.denominator;
        Rational r3 = new Rational(newN,newD);
        return r3.toString();
    }

    public static String getDivision(Rational r1, Rational r2) {
        int newN = r1.numerator * r2.denominator;
        int newD = r1.denominator * r2.numerator;
        Rational r3 = new Rational(newN,newD);
        return r3.toString();
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
