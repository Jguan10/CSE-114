import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a String");
        String s1 = userInput.nextLine();
        reverseDisplay(s1);
    }
    public static void reverseDisplay(String value) {
        if(value.length() == 0) {
            System.out.println(" ");
        }
        else if(value.length() != 0) {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
