package com.ashish;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr){
        int maxvalue = arr[0];
        for (int i=1;i<arr.length;i++){
            if (i>maxvalue){
                maxvalue = arr[i];
            }

        }
        return maxvalue;
    }

}



