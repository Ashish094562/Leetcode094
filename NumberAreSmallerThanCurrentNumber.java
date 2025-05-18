package com.ashish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] res= SmallerNumbers(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] SmallerNumbers(int[] nums){
        int count=0;
        int[] sort=nums.clone();
        Arrays.sort(sort);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sort.length;i++){
            if(!map.containsKey(sort[i])){
                map.put(sort[i],i);
            }
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=map.get(nums[i]);
        }
        return res;
    }
}
