package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class FindCharacterAtIndex {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The string is: " + str);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the index at which the character is to be found: ");
        int index = in.nextInt();
        if (index <= 26) {
            System.out.println("The character at the index " + index + " is: " + str.charAt(index));
        } else {
            System.out.println("Enter a number between 0 and 25");
        }
    }
}
