// This program will take degrees celsius and convert to degrees farenheit

import java.util.Scanner;
public class CelsisusToFarenheit {
    public static void main(String[] args) {
        double celsius; // Declare celsius
        double farenheit; // Declare farenheit
        System.out.println("Input temperature in Celsius");
        Scanner userInput = new Scanner(System.in);
        celsius = userInput.nextDouble(); // Assign value to celsius
        farenheit = (9.0 / 5.0) * celsius + 32; // Computer farenheit value
        System.out.println(celsius + " degrees Celsius is " +
                farenheit + " degrees farenheit");
    }
}
