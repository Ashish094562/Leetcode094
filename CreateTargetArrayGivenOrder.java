package com.ashish;


import java.util.Arrays;


public class CreateTargetArrayGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=CreateArray(nums,index);
        System.out.println(Arrays.toString(target));
    }

    static int[] CreateArray(int[] nums,int[] index){
           int[] target =new int[nums.length];
           int size=0;
           for(int i=0;i<nums.length;i++){
               for(int j=size;j> index[i];j--){
                   target[j]=target[j-1];
               }
               target[index[i]]=nums[i];
               size++;
           }
           return target;
    }
}
