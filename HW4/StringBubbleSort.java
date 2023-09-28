// Jiaxiong Guan
// 114548063
// This program takes a string list and sorts it

import java.util.Scanner;

public class StringBubbleSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] list1 = new String[10];
        System.out.println("Please input 10 strings: ");
        for(int i = 0; i < list1.length; i++) {
            list1[i] = userInput.next();
        }
        System.out.println("Sorted strings: ");
        for(int i = 0; i < list1.length; i++) {
            System.out.print(bubbleSortString(list1)[i] + " ");
        }
    }
    public static String[] bubbleSortString(String[] list1) {
        String temp;
        for(int i = 0; i < list1.length; i++) {
            for(int j = 0; j < list1.length; j++) {
                if(list1[i].compareToIgnoreCase(list1[j]) < 0) {
                    temp = list1[i];
                    list1[i] = list1[j];
                    list1[j] = temp;
                }
            }
        }
        return list1;
    }
}
