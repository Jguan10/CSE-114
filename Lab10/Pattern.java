
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = userInput.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n) {

        // Declare variables
        int space = n - 1;
        int stack = 1;

        // Sorts numbers into pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.print(stack);
            int holder = stack;
            while(holder > 1){
                holder = holder - 1;
                System.out.print(holder);
            }
            stack = stack + 1;
            space = space - 1;
            System.out.println("");
        }
    }
}
