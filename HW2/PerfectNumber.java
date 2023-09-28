// This program finds the perfect numbers up to the limit given

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        // Establishes limit
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer for the limit: ");
        int num = userInput.nextInt();
        int sum = 0;

        // Finds perfect numbers
        System.out.print("The perfect numbers going up to " + num + " are: ");
        for (int i = 1; i < num; i++) {
            for (int n = 1; n <= i - 1; n++) {
                if (i % n == 0) {
                    sum = sum + n;
                }
            }
            if (sum == i) {
                System.out.print(sum + " ");
            }
            sum = 0; // Reset sum
        }
    }
}

