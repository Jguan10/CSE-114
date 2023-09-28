// Jason Guan 114548063
// This program compares two Strings to check if they are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input the first string: ");
        String s1 = userInput.nextLine();
        System.out.println("Please input the second string: ");
        String s2 = userInput.nextLine();

        // Removes spaces from arrays
        String s1Cut = s1.replaceAll("\\s+", "");
        String s2Cut = s2.replaceAll("\\s+", "");

        // Outputs
        if(anagramCheck(s1Cut, s2Cut)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }


    // This method checks if the Strings are anagrams
    public static Boolean anagramCheck(String word1, String word2) {
        // Create arrays and declare variables
        String[] array1 = new String[word1.length()];
        String[] array2 = new String[word2.length()];
        int counter = 0;

        if (word1.length() == word2.length()) {

            // Puts words into array
            for (int i = 0; i < word1.length(); i++) {
                array1[i] = String.valueOf(word1.charAt(i));
                array2[i] = String.valueOf(word2.charAt(i));
            }

            // Sorts arrays in alphabetical order
            Arrays.sort(array1);
            Arrays.sort(array2);

            // Checks if arrays are identical
            for(int i = 0; i < word1.length(); i++) {
                if(array1[i].equalsIgnoreCase(array2[i])) {
                    counter++;
                }
            }
            if(counter == word1.length()) {
                return true;
            }
        }
        return false;
    }
}
