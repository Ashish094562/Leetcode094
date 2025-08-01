package com.ashish;

import java.util.Arrays;

class SpiralMatrixII {
    public static void main(String[] args) {
        int n =3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int bottom = n-1;
        int left =0;
        int right = n-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i =left;i<=right ;i++){
                matrix[top][i]=num++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                   matrix[i][left]=num++;
                }
                left++;
            }
        }
        return matrix;
    }
    
}