package com.ashish;

import java.util.ArrayList;
import java.util.List;

class FindAllDuplicateInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(nums);
        System.out.println(res);
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);

            }
            else{
                i++;
            }
        }
        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index =0; index<nums.length;index++){
            if(nums[index]!=index+1 ){
                ans.add(nums[index]);
            }
        }
        return ans;

    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}