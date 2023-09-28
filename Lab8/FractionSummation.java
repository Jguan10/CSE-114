// This program takes the maximum and minimum of a set of numbers that are increasing at the same rate
// and finds the sum of all of those numbers

public class FractionSummation {
    public static void main(String[] args) {
        System.out.println(addition(1, 97) + "/" + addition(3, 99));
        }
    public static double addition(int num1, int num2) {
        double multiplier = (num2 - num1) / 2.0;
        double summation = multiplier * (num1 + num2);
        return summation;
        }
    }
