package com.prowo.offer.fibonacci;

/**
 * @author prowo
 * @date 2018/4/16
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.err.println(fibonacci(7));
    }

    private static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
