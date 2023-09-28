// Jiaxiong Guan
// 114548063

import java.util.Scanner;
public class MatrixSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a 3x3 array: ");
        double[][] matrix = new double[3][3];
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = userInput.nextDouble();
            }
        }
        System.out.println("The row-sorted array is: ");
        System.out.println("");
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[0].length; column++) {
                System.out.print(sortRows(matrix)[row][column] + " ");
                if(column == 2) {
                    System.out.println("");
                }
            }
        }
    }
    public static double[][] sortRows(double[][] m) {
        double temp;
        for(int row = 0; row < m.length; row++) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (m[row][i] < m[row][j]) {
                        temp = m[row][i];
                        m[row][i] = m[row][j];
                        m[row][j] = temp;
                    }
                }
            }
        }
        return m;
    }
}
