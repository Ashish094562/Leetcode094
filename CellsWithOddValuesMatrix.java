package com.ashish;

class CellsWithOddValuesMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col= new int[n];

        for(int[] nums : indices){
            row[nums[0]]++;
            col[nums[1]]++;
        }
        int oddRows =0;
        for(int nums : row){
            if(nums %2==1){
                oddRows++;
            }
        }
        int oddCols=0;
        for(int nums :col){
            if(nums%2==1){
                oddCols++;
            }
        }
        return oddCols * (m- oddRows) + oddRows * (n- oddCols);
        
    }
}