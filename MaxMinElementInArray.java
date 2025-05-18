package com.ashish;

public class MaxMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {23,5,6,78,89,11,10};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        //assume arr.length!=0
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
    static int max(int[] arr){
        //assume arr.length!=0
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
}
