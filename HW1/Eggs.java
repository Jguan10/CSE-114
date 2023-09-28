// This program takes the number of eggs input by the user and calculates the price

import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        int amountOfEggs0; // Declare variable for amount of eggs
        double price = 0; // Declare variable for price
        int eggDozen = 0; // Declare variable for how many dozens
        int amountOfEggs1; // Declare second variable for amount of eggs
        System.out.println("How many eggs?");
        Scanner userInput = new Scanner(System.in);
        amountOfEggs0 = userInput.nextInt(); // Assign value to variable
        amountOfEggs1 = amountOfEggs0; // Assign value to second variable

        // Determine amount of dozens
        while (amountOfEggs1 >= 12) {
            amountOfEggs1 = amountOfEggs1 - 12;
            eggDozen = eggDozen + 1;
        }

        // Determine amount of loose eggs and price
        if (amountOfEggs1 < 12) {
            price = .45 * amountOfEggs1 + 3.25 * eggDozen;
        }
        System.out.println("You ordered " + amountOfEggs0 + " eggs. That's " + eggDozen +
                " dozen eggs at 3.25 per dozen and " + amountOfEggs1 +
                " loose eggs at 45 cents for a total of " + price + ".");
    }
}