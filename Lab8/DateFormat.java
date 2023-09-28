import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        String date;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the date in MM/DD/YYYY format: ");
        date = userInput.next();
        int num1 = Integer.parseInt(String.valueOf(date.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(date.charAt(1)));
        int num3 = 0;

        if (num1 == 0) {
            num3 = num2;
        }
        if (num1 == 1) {
            num3 = 10 + num2;
        }

        System.out.println("The date " + date + " can also be written as " + month(num3)
                + " " +date.charAt(3) + date.charAt(4) + "," + date.charAt(6) + date.charAt(7)
                + date.charAt(8) + date.charAt(9));
    }
    public static String month(int monthNum) {
        String monthName = " ";
        switch (monthNum) {
            case 1: monthName = "January";
            case 2: monthName = "February";
            case 3: monthName = "March";
            case 4: monthName = "April";
            case 5: monthName = "May";
            case 6: monthName = "June";
            case 7: monthName = "July";
            case 8: monthName = "August";
            case 9: monthName = "September";
            case 10: monthName = "October";
            case 11: monthName = "November";
            case 12: monthName = "December";
        }
        return monthName;
    }
}
