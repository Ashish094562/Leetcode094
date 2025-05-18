package com.ashish;

import java.util.Arrays;

public class ChangeValueExample {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
    }

}
