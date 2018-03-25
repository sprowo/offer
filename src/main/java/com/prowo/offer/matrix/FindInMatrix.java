package com.prowo.offer.matrix;

/**
 * 1. 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author prowo
 * @date 2017/12/22
 */
public class FindInMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        System.err.println(find(arr, 15));
    }

    public static boolean find(int[][] arr, int target) {
        int row = 0, column = arr.length - 1;

        while (row < arr[0].length && column >= 0) {
            if (arr[row][column] > target) {
                column--;
            } else if (arr[row][column] < target) {
                row++;
            } else {
                return true;
            }
        }

        return false;
    }

}
