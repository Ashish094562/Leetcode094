package com.ashish;

import java.util.LinkedList;
import java.util.List;

class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num,k));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int n = num.length-1;
        while(n>=0 || k>0){
            if(n>=0){
                k+=num[n];
    
            }
            res.addFirst(k%10);
            k/=10;
            n--;


        }
        return res;
    }
}