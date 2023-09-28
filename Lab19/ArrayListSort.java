
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please input 5 integers");
        for(int i = 0; i < 5; i++) {
            list.add(i, userInput.nextInt());
        }
        System.out.println("The sorted integers are: ");
        sort(list);
    }
    public static void sort(ArrayList<Integer> list) {
        int temp;
        int[] array = new int[list.size()];
        for(int i = 0; i < 5; i++) {
            array[i] = list.get(i);
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                if(list.get(i) > list.get(j)){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       for(int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
    }
}
