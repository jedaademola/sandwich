package wawa.hackerearth.sandwich.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramExample {


    public static void anagramCheck(String data1, String data2) {

        String s = "Lukman";
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum += s.charAt(1);
        }
        System.out.println("sum:" + sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter the 2 strings to check Anagram : ");
        Scanner scanner = new Scanner(System.in);
        String sentence1 = scanner.nextLine();//Getting input sentence 1
        String sentence2 = scanner.nextLine();//Getting input sentence 2

        if (sentence1.replaceAll(" ", "").length() == sentence1.replaceAll(" ", "").length()) {
            char[] characterArray1 = sentence1.toLowerCase().toCharArray(); //Converting string to character array
            char[] characterArray2 = sentence2.toLowerCase().toCharArray();//Converting string to character array
            // Arrays.asList(1,2);

            Arrays.sort(characterArray1);//Sorting array
            Arrays.sort(characterArray2);//Sorting array

            if (Arrays.equals(characterArray1, characterArray2)) {
                System.out.println("The input strings are Anagram");
            } else {
                System.out.println("The input strings are not Anagram");
            }

        } else {
            System.out.println("The input strings are not Anagram");
        }

        anagramCheck(sentence1, sentence2);
    }
}
