package com.ashish;

import java.util.Arrays;

class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat,r,c)));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat[0].length;
        int m= mat.length;
        if( m * n != r * c){
            return mat;        
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }
}