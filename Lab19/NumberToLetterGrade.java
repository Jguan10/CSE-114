
import java.util.ArrayList;
import java.util.Scanner;

public class NumberToLetterGrade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many grades are you putting in: ");
        int size = userInput.nextInt();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        System.out.println("Please input the number grades: ");
        for(int i = 0; i < size; i++) {
            intList.add(i, userInput.nextInt());
        }
        System.out.println("These are the letter grades: ");
        toLetter(intList);
    }
    public static void toLetter(ArrayList<Integer> list) {
        ArrayList<String> letterGrades = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 90) {
                letterGrades.add(i, "A");
            }
            else if(list.get(i) < 90 && list.get(i) >= 80) {
                letterGrades.add(i, "B");
            }
            else if(list.get(i) < 80 && list.get(i) >= 70) {
                letterGrades.add(i, "C");
            }
            else if(list.get(i) < 70 && list.get(i) >= 60) {
                letterGrades.add(i, "D");
            }
            else if(list.get(i) < 60) {
                letterGrades.add(i, "F");
            }
        }
        System.out.print(letterGrades);
    }
}
