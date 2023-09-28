// Jiaxiong Guan
// 114548063

import java.util.Scanner;
public class ComplexTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the real part of the first complex number: ");
        double rp1 = userInput.nextDouble();
        System.out.println("Please enter the imaginary part of the first complex number: ");
        double ip1 = userInput.nextDouble();
        System.out.println("Please enter the real part of the second complex number: ");
        double rp2 = userInput.nextDouble();
        System.out.println("Please enter the imaginary part of the second complex number: ");
        double ip2 = userInput.nextDouble();
        userInput.close();

        Complex c1 = new Complex(rp1, ip1);
        Complex c2 = new Complex(rp2, ip2);
        System.out.println("The first complex number is: " + c1.toString());
        System.out.println("The second complex number is: " + c2.toString());
        System.out.println("The complex numbers added is: " + Complex.getAddition(c1,c2));
        System.out.println("The complex numbers subtracted is: " + Complex.getSubtraction(c1,c2));
    }
}
