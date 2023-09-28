// This program checks the common prefix of two phrases input

import java.util.Scanner;
public class LargestCommonPrefix {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input phrase1 here: ");
        String phrase1 = userInput.next();
        System.out.println("Input phrase2 here: ");
        String phrase2 = userInput.next();
        String[] array1 = new String[phrase1.length()];
        String[] array2 = new String[phrase2.length()];
        int counter = 0;

        // Assign values to arrays
        for (int i = 0; i < phrase1.length(); i++) {
            array1[i] = String.valueOf(phrase1.charAt(i));
            }
        for (int i = 0; i < phrase2.length(); i++) {
            array2[i] = String.valueOf(phrase2.charAt(i));
            }

        // Check common prefix
        System.out.println("The common prefix is: ");
        while(array1[counter].equals(array2[counter])) {
            System.out.print(array1[counter]);
            counter++;
            if(counter == phrase1.length() || counter == phrase2.length()) {
                System.exit(0);
                }
            }
        }
    }