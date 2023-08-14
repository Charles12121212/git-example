package com.chen;

public class Demo02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int temp = arr [start];
            arr [start] = arr[end];
            arr [end] = arr[start];
            start++;
            end--;
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}


