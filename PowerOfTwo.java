package com.ashish;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n-1)) ==0;
        }

}