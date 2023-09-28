// This program takes the user inputted String and separates it into characters

import java.util.ArrayList;
import java.util.Scanner;

public class ToCharacterArray {
    public static void main(String[] args) {

        // Test program for toCharacterArray method
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a String: ");
        String s1 = userInput.nextLine();
        System.out.println("The characters of the String are: ");
        for(int i = 0; i < s1.length(); i++) {
            System.out.print(toCharacterArray(s1).get(i) + " ");
        }
    }

    // This method separates the string characters into an array list
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> characterArray = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            characterArray.add(i, s.charAt(i));
        }
        return characterArray;
    }
}
