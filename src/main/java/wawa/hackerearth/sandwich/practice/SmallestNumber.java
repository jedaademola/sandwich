package wawa.hackerearth.sandwich.practice;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] array = {88, 33, 55, 23, 64, 123};
        int smallNum = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < smallNum)
                smallNum = number;
        }
        System.out.println("Smallest number in array is: " + smallNum);
    }

}

