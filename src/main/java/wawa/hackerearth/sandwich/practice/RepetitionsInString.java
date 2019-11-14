package wawa.hackerearth.sandwich.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RepetitionsInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        int count = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (c1 == c2) {
                    int index = temp.indexOf(c1);
                    if (index == -1)
                        count = count + 1;
                }
            }
            if (temp.indexOf(c1) == -1) {
                temp = temp + c1;
                System.out.println("The Character   " + c1 + "   has occurred   " + count + "    times");
            }
            count = 0;
        }

        printDuplicateCharacters("Programming");
        printDuplicateCharacters("Combination");
        printDuplicateCharacters("Java");
    }


    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);

            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        //Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            // if (entry.getValue() > 1) {
            System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            //}
        }
    }
}
