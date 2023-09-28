// Jiaxiong Guan
// 114548063
// This program takes two integer lists and merges/sorts them

import java.util.Scanner;
import java.util.Arrays;

public class MergeList {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input list1 size and contents");
        int size1 = userInput.nextInt();
        int[] list1 = new int[size1];
        for(int i = 0; i < list1.length; i++) {
            list1[i] = userInput.nextInt();
        }
        System.out.println("Please input list2 size and contents");
        int size2 = userInput.nextInt();
        int[] list2 = new int[size2];
        for(int i = 0; i < list2.length; i++) {
            list2[i] = userInput.nextInt();
        }
        System.out.println("The merged list is: ");
        for(int i = 0; i < merge(list1, list2).length; i++) {
            System.out.print(merge(list1,list2)[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        for(int i = 0; i < list1.length; i++) {
            merged[i] = list1[i];
        }
        for(int i = 0; i < list2.length; i++) {
            merged[i + list1.length] = list2[i];
        }
        Arrays.sort(merged);
        return merged;
    }
}
