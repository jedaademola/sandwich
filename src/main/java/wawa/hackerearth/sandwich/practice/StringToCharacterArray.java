package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class StringToCharacterArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to be converted to character array: ");
        String str = in.nextLine();
        char[] chararray = str.toCharArray();
        System.out.println("String converted to character array is: ");
        for (int i = 0; i < chararray.length; i++) {
            System.out.println(chararray[i]);
        }
    }
}
