// Jason Guan 114548063
// This program reads the decimal number inputted by user and outputs the binary number

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        // Test program
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a decimal number: ");
        int decimal = userInput.nextInt();
        System.out.println(decimal + " in binary is: " + dec2Bin(decimal));
    }

    // This method converts the decimal number into a binary number
    public static String dec2Bin(int value) {

        // Create array lists and declare variables
        ArrayList<String> binNum = new ArrayList<>();
        ArrayList<String> reverse = new ArrayList<>();
        int holder = 1;

        // Divide number and add remainders to array list
        while(holder > .5) {
            holder = value / 2;
            binNum.add(String.valueOf(value % 2));
            value = value / 2;
        }

        // Convert array list to String
        StringBuffer placeHolder = new StringBuffer();
        for(int i = 0; i < binNum.size(); i++) {
            int size = binNum.size() - i - 1;
            reverse.add(i, binNum.get(size));
            placeHolder.append(reverse.get(i));
        }
        String binary = placeHolder.toString();
        return binary;
    }
}
