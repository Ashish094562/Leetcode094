package com.ashish;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans=buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] buildArray(int[] nums){
        if(nums.length!=0) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
        return new int[0];
    }

}
