import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = userInput.nextInt();
        System.out.println("The reversed integer is: " + reverseInt(number, intCount(number)));
    }

    // This method counts the amount of digits in an integer
    public static int intCount(int num1) {
        int count = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count = count + 1;
        }
        return count;
    }

    // This method reverses an integer
    public static int reverseInt(int initial, int digits) {

        // Create arrays and variables
        int[] reverse = new int[digits];
        double reverseNumber = 0;
        int digits2 = digits;
        int placeholder = initial;

        // Assign value to array
        for(int i = 0; i < digits; i++) {
            reverse[i] = placeholder % 10;
            placeholder = placeholder / 10;
        }

        // Reverse number
        for(int i = 0; i < digits; i++) {
            digits2 = digits2 - 1;
            reverseNumber = reverseNumber + (reverse[i] * Math.pow(10,digits2));
        }
        return (int) reverseNumber;
    }
}
