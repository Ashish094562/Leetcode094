package com.ashish;

import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new int[0];
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];

        }
        return nums;

    }
}
