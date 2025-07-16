package com.ashish;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left,right));
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i,i)) {
                result.add(i);
            }
        }
        return result;
    }

    static boolean isSelfDividing(int original,int num){
        if(num==0){
            return true;
        }
        int digit = num%10;
        if(digit==0 || original % digit!=0){
            return false;
        }
        return isSelfDividing(original,num/10);
    }
}
