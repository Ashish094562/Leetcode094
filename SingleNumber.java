package com.ashish;

public class SingleNumber {
    public static void main(String[] args) {
        int[]  nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int res=0;
        for (int n : nums){
            res^=n;
        }
        return res;
    }
}
