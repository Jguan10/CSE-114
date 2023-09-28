// This program takes the user input and determines if it is a palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a word here: ");
        String word = userInput.nextLine();
        String word2 = word.replaceAll("\\s+", "");
        if (check(word2)) {
            System.out.println(word + " is a palindrome");
        }
        else if (!(check(word2))) {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean check(String wordCheck) {

        // Create arrays and variables
        String[] forward = new String[wordCheck.length()];
        String[] backward = new String[wordCheck.length()];
        int swap = wordCheck.length();
        int counter = 0;

        // Assign value to forward array
        for (int i = 0; i < wordCheck.length(); i++) {
            forward[i] = String.valueOf(wordCheck.charAt(i));
        }

        // Assign value to backward array
        for (int i = 0; i < wordCheck.length(); i++) {
            swap = swap - 1;
            backward[i] = String.valueOf(wordCheck.charAt(swap));
        }

        // Check for palindrome
        for (int i = 0; i < wordCheck.length(); i++) {
            if(backward[i].equalsIgnoreCase(String.valueOf(forward[i]))) {
                counter = counter + 1;
                if(counter == wordCheck.length()){
                    return true;

                }
            }
        }
        return false;
    }
}
