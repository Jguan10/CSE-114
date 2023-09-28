// This program finds the armstrong numbers between two given limits

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer for the lower limit: ");
        int lowerLim = userInput.nextInt();
        System.out.println("Enter an integer for the upper limit: ");
        int upperLim = userInput.nextInt();
        int copy;
        int num0;
        double store = 0;

        // Separates digits into array
        for(int i = lowerLim; i < upperLim; i++) {
            int[] armstrongArray = new int[intCount(i)];
            copy = i;
            for (int n = 0; n < intCount(i); n++) {
                num0 = copy % 10;
                armstrongArray[n] = num0;
                copy = copy / 10;
            }

            // Computes and checks if number is an Armstrong number
            for (int j = 0; j < intCount(i); j++){
                store = store + Math.pow(armstrongArray[j],intCount(i));
            }
            if(store == i) {
                System.out.println(i + " is an Armstrong number");
            }
            store = 0;
        }
    }

    // This method counts the amount of integers in a given integer
    public static int intCount(int num1) {
        int count = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count = count + 1;
        }
        return count;
    }
}
