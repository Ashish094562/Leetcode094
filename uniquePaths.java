package com.ashish;

class uniquePaths {
    public static void main(String[] args) {
        int m=3,n=7;
        System.out.println(uniquePaths(m,n));
    }
    static int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return (int) result;
    }
}
