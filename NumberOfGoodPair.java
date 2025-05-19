package com.ashish;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPair {
    public static void main(String[] args) {

    }

    static int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq= new HashMap<>();
        int count=0;
        for(int num:nums){

            if(freq.containsKey(num)){
                count+=freq.get(num);
                freq.put(num,freq.get(num)+1);
            }
            else{
                freq.put(num,1);
            }
        }
        return count;
    }
}
