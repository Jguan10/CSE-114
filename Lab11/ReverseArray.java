import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int[] swap = new int[10];
        System.out.println("Please enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            swap[i] = userInput.nextInt();
        }
       reverse(swap);
    }

    public static void reverse(int[] x) {
        int temp = 0;
        int swap = x.length;
        for(int i = 0; i < x.length/2; i++) {
            swap = swap - 1;
            temp = x[i];
            x[i] = x[swap];
            x[swap] = temp;
        }

        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
