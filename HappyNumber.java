package com.ashish;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n) {
        // Floyd’s Cycle Detection Algorithm
        int slow = n;
        int fast = getSumOfSquares(n);

        while (fast != 1 && slow != fast) {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        }

        return fast == 1;
    }
    static int getSumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

}
