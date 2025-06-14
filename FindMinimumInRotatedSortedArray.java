package com.ashish;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        int pivot = FindPivot(nums);
        return nums[pivot+1];

    }
    static int FindPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]<= nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
