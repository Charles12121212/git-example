package com.chen.test2;

import java.util.Arrays;
import java.util.HashSet;

public class Demo03Test{
    public static void main(String[] args) {

        int[] a = {11, 33, 55, 88};
        int[] b = {22, 44, 66, 88};
        Demo03Test d = new Demo03Test();
        int[] c = d.arraySort(a, b);

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
    public int[] arraySort(int[] a, int[] b) {
        //定义集合把他们接住
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        //定义数组c接住
        int[] c = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            c[index++] = i;
        }
        return c;
    }
}
