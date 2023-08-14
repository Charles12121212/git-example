package com.chen;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        double[][] arr1 = new double[][]{{1, 2, 3}, {4, 5, 6}};
        double[] arr2 = {7, 8};
        arr1[0] = arr2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= arr1[i].length - 1; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
