package com.ashish;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(Search(nums,target));
    }
    static int Search(int[] nums,int target){
        int pivot = FindPivot(nums);
        if (pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);

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
    static int BinarySearch(int[] nums, int target,int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
