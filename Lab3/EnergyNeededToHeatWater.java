// This program takes the mass, initial temperature, and final temperature to compute energy 

import java.util.Scanner;
public class EnergyNeededToHeatWater {
    public static void main(String[] args) {
        double mass; // Declare mass of water
        double t0; // Declare initial temperature
        double t1; // Declare final temperature
        double q; // Declare energy

        // Input values for variables
        System.out.println("Input values for mass, initial temperature, " +
                "and final temperature line by line here: ");
        Scanner userInput = new Scanner(System.in);
        mass = userInput.nextDouble(); // Assign value to mass
        t0 = userInput.nextDouble(); // Assign value to initial temperature
        t1 = userInput.nextDouble(); // Assign value to final temperature
        q = (t1 - t0) * mass * 4184; // Compute value of energy 
        System.out.println("The energy in joules needed to heat water of mass " +
                mass + " from initial temperature " + t0 + " to a final temperature of " + t1 + " is " + q);
    }
}