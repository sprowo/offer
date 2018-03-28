package com.prowo.offer.subsum;

public class MaxSubSum {

    public static void main(String[] args) {
        int[] arr = {-2, 11, -4, 13, -5, -2};

        System.err.println(maxSubSum1(arr));
        System.err.println(maxSubSum2(arr));
        System.err.println(maxSubSum3(arr));
    }

    public static int maxSubSum3(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }
        int maxSum = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (maxSum < temp) {
                maxSum = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        return maxSum;
    }

    public static int maxSubSum2(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }
        int masSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                if (masSum < temp) {
                    masSum = temp;
                }
            }
        }
        return masSum;
    }

    public static int maxSubSum1(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }

        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                    if (maxSum < temp) {
                        maxSum = temp;
                    }
                }
            }
        }

        return maxSum;
    }


}
