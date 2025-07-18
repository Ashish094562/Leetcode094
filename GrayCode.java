package com.ashish;

import java.util.ArrayList;
import java.util.List;

class GrayCode {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(grayCode(n));
    }
    static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i=0;i<n;i++){
            int size = res.size();
            int mask = 1<<i;
            for(int j = size-1;j>=0;j--){
                res.add(res.get(j) | mask);
            }
        }
        return res;
    }
}