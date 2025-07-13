package com.ashish;

class PowerOfThree {
    public static void main(String[] args) {
        int n =27;
        System.out.println(isPowerOfThree(n));
    }
    static boolean isPowerOfThree(int n) {
         return n > 0 && 1162261467 % n == 0;
    }
}