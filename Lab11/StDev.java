import java.util.Scanner;
public class StDev {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] dev = new double[10];
        System.out.println("Please enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            dev[i] = userInput.nextDouble();
        }
        System.out.println("The mean is: " + mean(dev));
        System.out.println("The standard deviation is: " + deviation(dev));
    }
    public static double mean(double[] x) {
        double avg = 0;
        for(int i = 0; i < x.length; i++){
            avg = x[i] + avg;
        }
        avg = avg / x.length;
        return avg;
    }
    public static double deviation(double[] x){
        double stDev = 0;
        for(int i = 0; i < x.length; i++){
            x[i] = Math.pow(x[i] - mean(x),2.0);
            stDev = stDev + x[i];
        }
        stDev = stDev / (x.length - 1);
        stDev = Math.pow(stDev,0.5);
        return stDev;
    }
}
