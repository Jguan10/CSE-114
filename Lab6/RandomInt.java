
import java.util.Scanner;
import java.util.Random;
public class RandomInt {
    public static void main(String[] args) {
        double totalSum = 0;
        int i = 0;
        while (i < 10) {
            Scanner compInput = new Scanner(System.in);
            Random randInt = new Random();
            int intGather = 1+randInt.nextInt(100);
            System.out.println(intGather);
            totalSum = totalSum + intGather;
            i = i + 1;
        }
        double average = totalSum / 10.0;
        System.out.println("The average of the above 10 integers is: " + average);
    }
}