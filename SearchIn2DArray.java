package com.ashish;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {11,34,43,12},
                {23,45,67,76,12},
                {12,456,66,78,12}
        };
        int target =456;
        int[] ans= search(arr,target);
        System.out.println(target+" found at "+Arrays.toString(ans));
        System.out.println("max value:"+max(arr));
        System.out.println("min value:"+min(arr));
        System.out.println("Enhanced forloop max value:"+maxEnhanced(arr));
        System.out.println("Enhanced forloop min value:"+minEnhanced(arr));
    }

    static int[] search(int[][] arr,int target){
        if(arr.length!=0){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0 ; j<arr[i].length; j++) {
                    if(arr[i][j]==target){
                        return new int[]{i,j};
                    }
                }
            }



        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        if(arr.length!=0){
            int check = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0 ; j<arr[i].length; j++) {
                    if(arr[i][j]>check){
                        check=arr[i][j];
                    }
                }
            }
            return check;



        }
        return -1;
    }
    static int min(int[][] arr){
        if(arr.length!=0){
            int check = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0 ; j<arr[i].length; j++) {
                    if(arr[i][j]<check){
                        check=arr[i][j];
                    }
                }
            }
            return check;



        }
        return -1;
    }
    static int minEnhanced(int[][] arr){
        if(arr.length!=0){
            int check = arr[0][0];
            for (int[] ints : arr) {
                for (int element : ints) {
                    if (element < check) {
                        check = element;
                    }
                }
            }
            return check;



        }
        return -1;
    }
    static int maxEnhanced(int[][] arr){
        if(arr.length!=0){
            int check = arr[0][0];
            for(int[] arr1:arr){
                for(int num1:arr1){
                    if (num1>check){
                        check=num1;
                    }
                }
            }
            return check;



        }
        return -1;
    }
}
