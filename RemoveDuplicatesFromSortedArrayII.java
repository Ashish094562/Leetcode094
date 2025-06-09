package com.ashish;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

    }
    static int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int i =2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
