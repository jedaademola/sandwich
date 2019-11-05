package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[]) {
        System.out.print("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = num;
        int sum = 0, reminder;
        while (num > 0) {
            reminder = num % 10;
            sum = sum * 10 + reminder;
            num = num / 10;
        }
        if (sum == n) {
            System.out.println("The given number is a palindrome!");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
