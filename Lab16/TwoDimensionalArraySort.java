// This program takes a two-dimensional array and sorts it

import java.util.Scanner;

public class TwoDimensionalArraySort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many rows will the array have? ");
        int rows = userInput.nextInt();
        int[][] array = new int[rows][2];
        System.out.println("Please input " + rows + " rows with two numbers per row:");
        for(int row = 0; row < rows; row++) {
            for(int column = 0; column < 2; column++) {
                array[row][column] = userInput.nextInt();
            }
        }
        sort(array);
    }

    // This method sorts two-dimensional arrays with 2 columns
    public static void sort(int[][] m) {
        int tempRow;
        int tempCol;

        // Primary sort for row
        for(int row = 0; row < m.length; row++) {
            for(int search = 0; search < m.length; search++) {
                if(m[row][0] < m[search][0]) {
                    tempRow = m[row][0];
                    tempCol = m[row][1];
                    m[row][0] = m[search][0];
                    m[row][1] = m[search][1];
                    m[search][0] = tempRow;
                    m[search][1] = tempCol;
                }

                // Secondary sort for column
                if(m[row][1] < m[search][1] && m[row][0] == m[search][0]) {
                    tempCol = m[row][1];
                    m[row][1] = m[search][1];
                    m[search][1] = tempCol;
                }
            }
        }
        for(int row = 0; row < m.length; row++) {
            System.out.print("{ ");
            for(int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.print("}");
            System.out.println(" ");
        }
    }
}
