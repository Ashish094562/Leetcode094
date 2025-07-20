package com.ashish;

import java.util.Arrays;

class Find_N_UniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] res = new int[n];
        int index =0;
        for(int i=1;i<=n/2;i++){
            res[index++]=-i;
            res[index++] = i;
        }
        if(n%2 !=0){
            res[index] =0;
        }
        return res;
    }
}