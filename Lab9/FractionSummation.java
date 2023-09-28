
import java.util.Scanner;
public class FractionSummation {
    public static void main(String[] args) {
        System.out.println("Please input how many fractions the program should add: ");
        Scanner userInput = new Scanner(System.in);
        int sumAmount = userInput.nextInt();
        double total = 0;
        for (int i = 0; i <= sumAmount; i++) {
            double fract1 = i / (i + 1.0);
            total = fract1 + total;
            if (i == sumAmount) {
                System.out.println("The summation of " + sumAmount + " fractions is " + total);
            }
        }
    }
}