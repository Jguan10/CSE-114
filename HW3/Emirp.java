// Jason Guan 114548063
// This program outputs the first 100 prime numbers, of which their reversed number is also prime

public class Emirp {
    public static void main(String[] args) {
        int numCounter = 1;
        int primeCounter = 0;
        for(int i = 0; i < numCounter; i++) {
            if(primeCheck(i) && primeCheck(reverseInt(i, intCount(i)))
                    && i != reverseInt(i, intCount(i))) {
                System.out.print(i + " ");
                primeCounter++;
                if(primeCounter % 10 == 0 && primeCounter > 1) {
                    System.out.println(" ");
                }
            }
            numCounter++;
            if(primeCounter == 100) {
                System.exit(0);
            }
        }
    }


    // This method checks whether a number is prime
    public static boolean primeCheck(int number) {
        int divisor = 1;
        int checker = 0;
        while(divisor < number) {
            if(number % divisor == 0) {
                checker++;
            }
            divisor++;
        }
        if(checker == 1) {
            return true;
        }
        return false;
    }


    // This method reverses the integer given
    public static int reverseInt(int initial, int digits) {

        // Create arrays and variables
        int[] reverse = new int[digits];
        double reverseNumber = 0;
        int digits2 = digits;
        int placeholder = initial;

        // Assign value to array
        for (int i = 0; i < digits; i++) {
            reverse[i] = placeholder % 10;
            placeholder = placeholder / 10;
        }

        // Reverse number
        for (int i = 0; i < digits; i++) {
            digits2 = digits2 - 1;
            reverseNumber = reverseNumber + (reverse[i] * Math.pow(10, digits2));
        }
        return (int) reverseNumber;
    }

    // This method counts the number of digits in an integer
    public static int intCount(int num1) {
        int count = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count = count + 1;
        }
        return count;
    }
}