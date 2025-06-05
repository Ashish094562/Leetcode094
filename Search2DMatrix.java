package com.ashish;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length-1;
        while(rows < matrix.length && cols>=0){
            if(matrix[rows][cols]==target){
                return true;
            }
            else if (matrix[rows][cols]<target){
                rows++;
            }
            else{
                cols--;
            }

        }
        return false;

    }
}
