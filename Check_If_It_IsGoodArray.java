package com.ashish;

class Check_If_It_IsGoodArray {
    public static void main(String[] args) {
        int[] nums = {12,5,7,23};
        System.out.println(isGoodArray(nums));
    }
     static boolean isGoodArray(int[] nums) {
        int gcd =nums[0];
        for(int i=1;i<nums.length;i++){
            gcd = gcd(gcd,nums[i]);
            if(gcd==1) return true;
        }
        return gcd==1;
    }
    static int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}