// This program reads the n x n matrix input and calculates the sum of the elements in the major diagonal

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many rows and columns will the n x n matrix have? ");
        int n = userInput.nextInt();
        double[][] matrix = new double[n][n];
        System.out.println("Enter a n x n matrix: ");

        // Assign values to matrix
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n; column++) {
                matrix[row][column] = userInput.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is: " + sumMajorDiagonal(matrix));
    }

// This method calculates the sum of the elements in the major diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for(int row = 0; row < m.length; row++) {
            for(int column = 0; column < m[0].length; column++) {
                if(row == column){
                    sum = sum + m[row][column];
                }
            }
        }
        return sum;
    }
}
