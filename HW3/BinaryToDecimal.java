// Jason Guan 114548063
// This program converts the user inputted binary number to a decimal number

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        // Test program
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a binary number: ");
        String binary = userInput.nextLine();
        System.out.println("The decimal number form of " + binary + " is: " + bin2Dec(binary));
    }

    // This method converts a binary number into a decimal number
    public static int bin2Dec(String binaryString) {
        int decimal = 0;
        String[] binary = new String[binaryString.length()];
        int[] decimalArray = new int[binaryString.length()];
        for(int i = 0; i < binaryString.length(); i++) {
            binary[i] = String.valueOf(binaryString.charAt(binaryString.length() - i - 1));
            decimalArray[i] = Integer.parseInt(binary[i]);
            decimal = (int) (decimalArray[i] * Math.pow(2,i) + decimal);
        }
        return decimal;
    }
}
