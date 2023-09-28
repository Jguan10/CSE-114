// This program reads the student scores, gets the best score, and assigns a grade based on the best score

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int numberOfStudents = userInput.nextInt();
        double largestScore = 0;
        System.out.println("Enter the scores of the students: ");
        double[] studentScores = new double[numberOfStudents];
        String[] letterGrade = new String[numberOfStudents];

        // Assigns scores inputted by user into an array
        for(int i = 0; i < numberOfStudents; i++) {
            studentScores[i] = userInput.nextDouble();
        }

        // Finds the largest score in the array
        for(int i = 0; i < numberOfStudents; i++) {
            if(studentScores[i] > largestScore) {
                largestScore = studentScores[i];
            }
        }

        // Assigns letter grade to array based on number grade
        for(int i = 0; i < numberOfStudents; i++) {
            if(studentScores[i] == largestScore) {
                letterGrade[i] = "A";
            }
            if(studentScores[i] >= largestScore - 10 && studentScores[i] < largestScore) {
                letterGrade[i] = "A";
            }
            if(studentScores[i] >= largestScore - 20 && studentScores[i] < largestScore - 10) {
                letterGrade[i] = "B";
            }
            if(studentScores[i] >= largestScore - 30 && studentScores[i] < largestScore - 20) {
                letterGrade[i] = "C";
            }
            if(studentScores[i] >= largestScore - 40 && studentScores[i] < largestScore - 30) {
                letterGrade[i] = "D";
            }
            if(studentScores[i] <= largestScore - 40) {
                letterGrade[i] = "F";
            }
            System.out.println("Student " + i + " has a score of "
                    + studentScores[i] + " and a grade of " + letterGrade[i]);
        }
    }
}
