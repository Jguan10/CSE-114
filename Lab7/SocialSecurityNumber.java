// This program will take a SSN and check its validity


import java.util.Scanner;

public class SocialSecurityNumber {
    public static void main(String[] args) {
        String nums; // Create String variable "nums"
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your Social Security number: ");
        nums = userInput.next();

        // Check validity, checking to see if 3 and 6 are "-"
        boolean check = nums.charAt(3) == nums.charAt(6)
                && !(Character.isDigit(nums.charAt(3))) && !(Character.isAlphabetic(nums.charAt(3)))
                && nums.contains("-");

        // Check validity, checking to see if the rest of the values are digits
        if (Character.isDigit(nums.charAt(0)) && Character.isDigit(nums.charAt(1))
                && Character.isDigit(nums.charAt(2)) && Character.isDigit(nums.charAt(4))
                && Character.isDigit(nums.charAt(5)) && Character.isDigit(nums.charAt(7))
                && Character.isDigit(nums.charAt(8)) && Character.isDigit(nums.charAt(9))
                && Character.isDigit(nums.charAt(10)) && check) {
            System.out.println(nums + " is a valid Social Security Number");
        }
        else {
            System.out.println(nums + " is not a valid Social Security Number");
        }
    }
}

