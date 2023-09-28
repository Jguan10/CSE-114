// This program takes an integer and determines its divisibility with 5 and 6

import java.util.Scanner;
public class DivisibleTest {
    public static void main(String[] args)  {
        int dividend; // Declare variable "dividend"
        double divideByFive; // Declare variable "divideByFive"
        double divideBySix; // Declare variable "divideBySix"
        System.out.println("Enter an integer: ");
        Scanner userInput = new Scanner(System.in);
        dividend = userInput.nextInt(); // Assign value to variable "dividend"
        divideByFive = dividend % 5.0; // Assign value of remainder to variable
        divideBySix =  dividend % 6.0; // Assign value of remainder to variable

        // Check for divisibility by five and six
        boolean check = divideByFive == 0 && divideBySix == 0;
        System.out.println("Is " + dividend + " divisible by 5 and 6? " + check);

        // Check for divisibility by five or six
        check = divideByFive == 0 || divideBySix == 0;
        System.out.println("Is " + dividend + " divisible by 5 or 6? " + check);

        // Check for divisibility by five or six but not both
        check = (divideByFive == 0 || divideBySix == 0) != (divideByFive == 0 && divideBySix == 0);
        System.out.println("Is " + dividend + " divisible by 5 or 6, but not both? " + check);
    }
}
