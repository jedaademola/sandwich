package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String args[]) {
        String str1, str2 = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str1 = in.nextLine();
        int length = str1.length();
        for (int i = length - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
