package com.ashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class fourSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n<4) return list;
        for(int i =0;i<n-3;i++){
            if(i>0 && nums[i]== nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int right = n-1;
                while (left < right) {
                long total = (long) nums[i] +nums[j]+ nums[left] + nums[right];
                if (total == target) {
                    list.add(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
    return list;

    }
}