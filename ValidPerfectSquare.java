package com.ashish;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num =16;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long start=1,end=num/2;
            while(start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                long mid = start + (end - start) / 2;
                long square=mid*mid;
                if (square==num) {
                    return true;
                } else if (square<num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return false;
    }
}
