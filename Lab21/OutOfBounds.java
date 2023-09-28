import java.util.Random;
import java.util.Scanner;

public class OutOfBounds {
    public static void main(String[] args) {
        Random randInt = new Random();
        Scanner userInput = new Scanner(System.in);
        int[] randomNumbers = new int[100];
        for(int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randInt.nextInt(100 - 1) + 1;
        }
        System.out.println("Please input the index: ");
        int index = userInput.nextInt();
        if(index < randomNumbers.length) {
            System.out.println(randomNumbers[index]);
        }
        else {
            System.out.println("Out of bounds");
        }
    }
}
