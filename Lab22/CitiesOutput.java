import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class CitiesOutput {
    public static void main(String[] args) {
        File f1 = new File("cities.txt");
        File f2 = new File("output.txt");
        String[] list = {"Dallas","Houston","Chicago","Denver","Tampa",
                "Miami","Charlotte","Austin","Detroit","Seattle"};

        // Try - catch block for cities.txt file
        try{
            FileWriter fw = new FileWriter(f1);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < list.length; i++) {
                pw.println(list[i]);
            }
            pw.flush();
            pw.close();
            fw.close();
        }catch(IOException ex1) {
            System.out.println(ex1);
        }

        // Try - catch block for output.txt file
        try{
            Scanner reader = new Scanner(f1);
            FileWriter fw = new FileWriter(f2);
            PrintWriter pw = new PrintWriter(fw);
            ArrayList<String> reverseList = new ArrayList<>();
            while(reader.hasNext()) {
                reverseList.add(reader.nextLine());
            }
            for(int i = 0; i < reverseList.size(); i++) {
                pw.println(reverseList.get(reverseList.size() - i - 1));
            }
            pw.flush();
            pw.close();
            fw.close();
            reader.close();
        }catch(IOException ex2) {
            System.out.println(ex2);
        }
    }
}
