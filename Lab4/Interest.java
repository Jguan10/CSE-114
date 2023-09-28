// This program takes balance and annual interest rate to compute interest

import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        double interestRate; // Declare annual interest rate
        double balance; // Declare balance
        System.out.println("Input balance:\nInput interest rate:");
        Scanner userInput = new Scanner(System.in);
        balance = userInput.nextDouble(); // Assign value to balance
        interestRate = userInput.nextDouble(); // Assign value to interest rate
        double interest = balance * (interestRate / 1200.0);
        System.out.println("Given balance " + balance + " and annual interest rate " +
                interestRate + " interest is " + interest + ".");
    }
}
