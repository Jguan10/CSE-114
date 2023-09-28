import java.util.Random;
import java.util.Scanner;

public class MismatchSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean check = true;
        Random randInt = new Random();
        int num1 = randInt.nextInt(100 - 1) + 1;
        int num2 = randInt.nextInt(100 - 1) + 1;
        System.out.println("Enter the sum of " + num1 + " and " + num2);
        int sum = userInput.nextInt();
            do {
                if(sum == (num1 + num2)) {
                    System.out.println("That is correct!");
                    check = false;
                }
                else{
                    System.out.println("The sum is incorrect, please try again");
                    sum = userInput.nextInt();
                    }
            }while (check) ;
    }
}

