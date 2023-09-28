// This program takes an entered phone number and formats it

import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args) {
        String[] numbers = new String[10]; // Create array "numbers"
        String phone; // Create String variable "phone"
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your phone number: ");
        phone = userInput.next();

        // Assign values to array
        for (int i = 0; i < 10; i++) {
            numbers[i] = String.valueOf(phone.charAt(i));
        }
        System.out.println("Your formatted phone number is (" + numbers[0] +
                numbers[1] + numbers[2] + ")" + numbers[3] + numbers[4] +
                numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers [9]);
        }
    }
