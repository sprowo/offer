package com.prowo.offer.array;

/**
 * @author prowo
 * @date 2018/4/16
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.err.println(minNumberInRotateArray(arr));
    }

    private static int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return 0;
    }

}
