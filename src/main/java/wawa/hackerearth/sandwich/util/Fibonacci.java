package wawa.hackerearth.sandwich.util;

public class Fibonacci {

    /*    Write a function int fib(int n) that returns Fn. For example, if n = 0, then fib() should return 0.
        If n = 1, then it should return 1. For n > 1, it should return Fn-1 + Fn-2
        Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
        Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
        */
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.printf("n %d fib: %d \n", n, fib(n));
        n = 0;
        System.out.printf("n %d fib: %d \n", n, fib(n));
        n = 1;
        System.out.printf("n %d fib: %d \n", n, fib(n));
    }

}
