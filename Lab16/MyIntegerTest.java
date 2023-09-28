// This program tests the MyInteger object class

import java.util.Scanner;

public class MyIntegerTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input an integer:");
        int testInt = userInput.nextInt();
        MyInteger int1 = new MyInteger(testInt);
        System.out.println("Is the integer even: " + MyInteger.isEven(int1.getValue()));
        System.out.println("Is the integer even: " + int1.isEven());
        System.out.println("Is the integer odd: " + MyInteger.isOdd(int1.getValue()));
        System.out.println("Is the integer odd: " + int1.isOdd());
        System.out.println("Is the integer prime: " + MyInteger.isPrime(int1.getValue()));
        System.out.println("Is the integer prime: " + int1.isPrime());
    }
}
