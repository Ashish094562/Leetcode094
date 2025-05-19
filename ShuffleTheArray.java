package com.ashish;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n =3;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        if(nums==null || nums.length==0){
            return new int[0];
        }
        int[] res = new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[i+n];
        }
        return res;
    }
}
