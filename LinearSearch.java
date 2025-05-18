package com.ashish;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 34, 56, 78, 0};
        int target = 18;
        int ans = linear(arr,target);
        System.out.println(ans);
        ans = linear2(arr,target);
        System.out.println(ans);
    }
    static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }

        }
        return Integer.MAX_VALUE;
    }
static int linear2(int[] arr,int target){
    if(arr.length==0){
        return -1;
    }
    for(int element : arr){
        if(element==target){
            return element;
        }

    }
    return Integer.MAX_VALUE;
}
}
