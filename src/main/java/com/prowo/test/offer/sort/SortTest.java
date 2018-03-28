package com.prowo.test.offer.sort;

import com.alibaba.fastjson.JSON;

public class SortTest {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2};

//        insertSort(arr);

        quickSort(arr, 0, arr.length - 1);

        System.err.println(JSON.toJSONString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || left >= right) {
            return;
        }

        int key = arr[left];
        int low = left;
        int high = right;

        while (low < high) {
            while (low < high && arr[high] > key) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] < key) {
                low++;
            }
            arr[high] = arr[low];
        }

        arr[low] = key;
        quickSort(arr, left, low - 1);
        quickSort(arr, low + 1, right);
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
