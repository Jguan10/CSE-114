// This program takes temperature and wind speed to calculate wind chill temperature

import java.util.Scanner;
public class WindChill {
    public static void main(String[] args){
        double temperature; // Declare variable for temperature
        double windSpeed; // Declare variable for wind speed
        double windChillTemp = 0; // Declare variable for wind chill temperature
        System.out.println("Input temperature in Fahrenheit and wind speed in mph:");
        Scanner userInput = new Scanner(System.in);
        temperature = userInput.nextDouble(); // Assign value to temperature variable
        windSpeed = userInput.nextDouble(); // Assign value to wind speed variable

        // Check variables
        if (temperature > 41 | temperature < -58 | windSpeed < 2) {
            System.out.println("Please input a temperature between -58 and 41 and " +
                    "a wind speed greater than or equal to 2");
        }


        else {
            windSpeed = Math.pow(windSpeed,0.16);
            windChillTemp = 35.74 + .61215 * temperature +
                    35.75 * windSpeed + .4275 * temperature * windSpeed;
            System.out.println("The wind chill temperature is " + windChillTemp + ".");
        }
    }
}
