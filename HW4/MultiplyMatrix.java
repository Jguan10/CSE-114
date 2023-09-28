// Jiaxiong Guan
// 114548063
// This program takes two 3x3 arrays and multiplies them

import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input array a: ");
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                a[row][column] = userInput.nextDouble();
            }
        }
        System.out.println("Please input array b: ");
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                b[row][column] = userInput.nextDouble();
            }
        }
        System.out.println("Multiplied array is: ");
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.print(multiplyMatrix(a, b)[row][column] + " ");
                if(column == 2) {
                    System.out.println(" ");
                }
            }
        }
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[3][3];
        for(int row = 0; row < 3; row++) {
            for(int column = 0; column < 3; column++) {
                matrix[row][column] = (a[row][0] * b[0][column]) + (a[row][1] * b[1][column]) + (a[row][2] * b[2][column]);
                }
            }
        return matrix;
    }
}
