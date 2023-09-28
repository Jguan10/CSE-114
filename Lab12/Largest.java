import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of rows: ");
        int rows = userInput.nextInt();
        System.out.println("Please enter the amount of columns: ");
        int columns = userInput.nextInt();
        System.out.println("Please enter the array: ");
        double [][] large = new double [rows][columns];
        for (int row = 0; row < 3; row++) {
            for(int column = 0; column < 4; column++) {
                large[row][column] = userInput.nextDouble();
            }
        }

        System.out.println("The coordinates of the largest number is (" + locateLargest(large)[1] +
                "," + locateLargest(large)[0] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] coordinate = new int[2];
        double check = 0;
        for(int i = 0; i < a.length * a[0].length; i++) {
            for (int row = 0; row < a.length; row++) {
                for (int column = 0; column < a[row].length; column++) {
                    if (a[row][column] > check) {
                        check = a[row][column];
                        coordinate[0] = row;
                        coordinate[1] = column;
                    }
                }
            }
        }
        return coordinate;
    }
}
