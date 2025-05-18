package com.ashish;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] arr=new int[5];

        input(arr);
        System.out.println("Enter Target Element:");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("Element Found-True/ Not - False :"+targetcheck(arr,target));
        System.out.println("Minimum value is "+min(arr));
        System.out.println("Maximum value is "+max(arr));

    }
    static void input(int[] arr){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            arr[i]=sc.nextInt();
        }
    }
    static int min(int[] arr){
        int min = arr[0];
        if(arr.length!=0) {
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
        return -1;
    }
    static int max(int[] arr){
        int max = arr[0];
        if(arr.length!=0) {
            for(int num:arr){
                if(num>max){
                    max = num;
                }
            }
            return max;
        }
        return -1;
    }
    static boolean targetcheck(int[] arr ,int target){
        if(arr.length!=0) {
            for(int num:arr){
                if(num==target){
                    return true;
                }
            }
        }
        return false;
    }
}
