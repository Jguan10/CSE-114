// This program combines two lists and sorts them in alphabetical order

import java.util.ArrayList;
import java.util.Arrays;

public class MergeList {
    public static void main(String[] args) {

        // Test program
        String[] s1 = {"Austin", "Dallas", "San Francisco"};
        String[] s2 = {"Boston", "Chicago", "Denver", "Seattle"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(s1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(s2));
        System.out.println(mergeList(list1,list2));
    }

    // This method combines the two lists and sets them in alphabetical order
    public static ArrayList<String> mergeList(ArrayList<String> lst1,
                                              ArrayList<String> lst2) {

        // Combine lists
        ArrayList<String> merge = new ArrayList<>();
        String temp;
        for(int i = 0; i < lst1.size(); i++) {
            merge.add(lst1.get(i));
        }
        for(int i = 0; i < lst2.size(); i++) {
            merge.add(lst2.get(i));
        }

        // Sorts in alphabetical order
        for(int i = 0; i < merge.size(); i++) {
            for(int j = 0; j < merge.size(); j++) {
                if(merge.get(j).compareToIgnoreCase(merge.get(i)) > 0) {
                    temp = merge.get(i);
                    merge.set(i, merge.get(j));
                    merge.set(j, temp);
                }
            }
        }
        return merge;
    }
}
