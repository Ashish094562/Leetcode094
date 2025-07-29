package com.ashish;

import java.util.Arrays;

class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0]=1;
        for(int i =1;i<nums.length;i++){
           arr[i] = arr[i-1] * nums[i-1];
        }
        int suffix =1;
        for(int i = nums.length-1;i>=0;i--){
            arr[i] *=suffix;
            suffix *=nums[i];
        }
        return arr;
    }
    
}