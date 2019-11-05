package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class AllSubstrings {
    //https://www.java-programs.thiyagaraaj.com/string_comparison_java_example_program.html
    public static void main(String args[]) {
        String str1, str2;
        int length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to find its sub-strings");
        str1 = in.nextLine();
        length = str1.length();
        System.out.println("Sub-strings of the string \"" + str1 + "\" are");
        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                str2 = str1.substring(c, c + i);
                System.out.println("substring:" + str2 + " i:" + i);
            }
        }
    }
}
