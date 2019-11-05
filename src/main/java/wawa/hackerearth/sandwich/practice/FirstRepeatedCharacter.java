package wawa.hackerearth.sandwich.practice;

import java.util.Scanner;

public class FirstRepeatedCharacter {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        FirstRepeatedCharacter frc = new FirstRepeatedCharacter();
        frc.mainLoop();
    }

    void mainLoop() {
        String str = " ";
        System.out.println("Please enter a string: ");
        str = in.next();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int firstIndex = str.indexOf(character);
            int lastIndex = str.lastIndexOf(character);
            if (firstIndex != lastIndex) {
                System.out.println("The character '" + character + "' is repeated");
                break;
            }
        }
        //else
        //System.out.println("No character repeated");
    }
}
