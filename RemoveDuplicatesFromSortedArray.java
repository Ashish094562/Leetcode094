package com.ashish;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
