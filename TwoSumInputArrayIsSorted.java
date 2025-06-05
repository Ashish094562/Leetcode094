package com.ashish;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start =0,end=numbers.length-1,sum=0;
        while(start<end){
            sum = numbers[start]+ numbers[end];
            if (sum==target){
                return new int[]{start+1,end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
