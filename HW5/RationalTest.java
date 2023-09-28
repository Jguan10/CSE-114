// Jiaxiong Guan
// 114548063

import java.util.Scanner;
public class RationalTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the numerator for the first number");
        int num1 = userInput.nextInt();
        System.out.println("Enter the denominator for the first number");
        int den1 = userInput.nextInt();
        System.out.println("Enter the numerator for the second number");
        int num2 = userInput.nextInt();
        System.out.println("Enter the denominator for the second number");
        int den2 = userInput.nextInt();
        userInput.close();

        Rational r1 = new Rational(num1, den1);
        Rational r2 = new Rational(num2, den2);
        System.out.println("The first rational number is: " + r1.toString());
        System.out.println("The second rational number is: " + r2.toString());
        System.out.println("The sum of the two is: " + Rational.getAddition(r1,r2));
        System.out.println("The difference of the two is: " + Rational.getSubtraction(r1,r2));
        System.out.println("The product of the two is: " + Rational.getMultiplication(r1,r2));
        System.out.println("The quotient of the two is: " + Rational.getDivision(r1,r2));
    }
}
