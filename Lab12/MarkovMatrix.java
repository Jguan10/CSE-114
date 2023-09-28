import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the 3x3 array: ");
        double [][] check = new double [3][3];
        for(int row = 0; row < check.length; row++) {
            for(int column = 0; column < check[row].length; column++) {
                check[row][column] = userInput.nextDouble();
            }
        }
        if(isMarkovMatrix(check)) {
            System.out.println("It is a Markov Matrix");
        }
        else {
            System.out.println("It is not a Markov Matrix");
        }
    }
    public static boolean isMarkovMatrix(double[][] m) {
        double sum = 0;
        int check = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (m[row][column] < 0) {
                    return false;
                }
            }
        }

        for (int column = 0; column < m.length; column++) {
            for (int row = 0; row < m[0].length; row++) {
                sum = sum + m[row][column];
                if(sum == 1) {
                    check = check + 1;
                }
            }
            sum = 0;
            if (check == 3) {
                return true;
            }
        }
        return false;
    }
}
