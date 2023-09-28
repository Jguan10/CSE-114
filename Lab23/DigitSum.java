import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int num = userInput.nextInt();
        System.out.println("The sum of the digits in " + num + " is " + sumDigits(num));
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        else
            return n % 10 + sumDigits(n / 10);
    }
}

