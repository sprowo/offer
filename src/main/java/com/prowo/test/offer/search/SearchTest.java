package com.prowo.test.offer.search;

/**
 * @author prowo
 * @date 2018/3/27
 */
public class SearchTest {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] arr = null;
        System.err.println(binarySearch(arr, 6));
        System.err.println(binarySearch2(arr, 0, arr.length - 1, 5));
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int left, int right, int key) {
        if (arr == null) {
            throw new NullPointerException("arr is null");
        }

        if (left <= right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                binarySearch2(arr, left, mid - 1, key);
            } else if (key > arr[mid]) {
                binarySearch2(arr, mid + 1, right, key);
            } else {
                return mid;
            }
        }

        return -1;
    }

}
