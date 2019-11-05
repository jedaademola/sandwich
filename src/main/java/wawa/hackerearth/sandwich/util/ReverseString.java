package wawa.hackerearth.sandwich.util;

public class ReverseString {

    public static void main(String[] args) {
        //String input = "Geeks for Geeks";
        String input = "Lukman";
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        //input1.append(input);

        // reverse StringBuilder input1
        //input1 = input1.reverse();

        // print reversed String
        int len = input.length() - 1;
        for (int i = len; i >= 0; --i) {
            input1.append(input.charAt(i));
        }
        System.out.println("Reverse:" + input1);
    }
}
