package wawa.hackerearth.sandwich.util;

import java.util.*;

public class ArrangeXter {
    //Ccbbbaa
    //Bbbaacc
    public static String reArrangeXter(String xters) {
        for (int i = 0; i < xters.length(); ++i) {
            char c = xters.charAt(i);
        }
        return null;
    }

    public static void main(String args[]) {
        System.out.println(reArrangeXter("Ccbbbaa"));
        //Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Integer arr[] = {-9, -18, 0, 25, 4};//{ 5, 6, 7, 8, 1, 2, 3, 4, 3 };
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));


        System.out.println("The maximum value is : ");

        // Using stream.max() to get maximum
        // element according to provided Comparator
        // and storing in variable var
        Integer var = list.stream().max(Integer::compare).get();
        Integer varSet = set.stream().max(Integer::compare).get();

        System.out.println("for List:" + var);
        System.out.println("for Set:" + varSet);
    }
}
