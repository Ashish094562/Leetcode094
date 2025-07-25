package com.ashish;

import java.util.Arrays;

class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
    static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = arr[i >>1] + ( i & 1);
        }
        return arr;
    }
}