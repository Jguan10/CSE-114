// Jiaxiong Guan
// 114548063
// This program eliminates duplicates from a 10 integer list

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input 10 integers: ");
        int[] list = new int[10];
        for(int i = 0; i < list.length; i++) {
            list[i] = userInput.nextInt();
        }
        System.out.println("The distinct integers are: ");
        for(int i = 0; i < eliminateDuplicate(list).length; i++) {
            if(i == 0 || eliminateDuplicate(list)[i] != 0) {
                System.out.print(eliminateDuplicate(list)[i] + " ");
            }
        }
    }
    public static int[] eliminateDuplicate(int[] list) {
        int counter = 0;
        Arrays.sort(list);
        for(int i = 0; i < list.length; i++) {
            if(i < list.length - 1 && list[i] == list[i + 1]) {
                list[i] = list[0];
                counter++;
            }
        }
        int[] sorted = new int[10 - counter];
        for(int i = 0; i < sorted.length; i++) {
            sorted[i] = list[i + counter];
        }
        return sorted;
    }
}
