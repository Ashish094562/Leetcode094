package com.ashish;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int n= nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum =0;
        for(int i:nums){
            actualSum+=i;
        }
        return expectedSum - actualSum;

    //We can also use XOR approach like this
    /*
    int xor = 0;
    int n = nums.length;

    for (int i = 0; i <= n; i++) {
        xor ^= i;
    }

    for (int num : nums) {
        xor ^= num;
    }

    return xor;
    */
    }
}
