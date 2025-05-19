package com.ashish;

public class RichestCostumerWealth {
    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
