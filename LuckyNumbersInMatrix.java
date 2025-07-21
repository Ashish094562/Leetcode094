package com.ashish;

import java.util.ArrayList;
import java.util.List;

class LuckyNumbersInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            int mincol=0;
            for(int j=1;j<cols;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }
            boolean isMax = true;
            for(int k=0;k<rows;k++){
                if(matrix[k][mincol]>matrix[i][mincol]){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                list.add(matrix[i][mincol]);
            }
        }
        return list;
    }
}