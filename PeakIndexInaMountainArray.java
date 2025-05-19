package com.ashish;

public class PeakIndexInaMountainArray {
    public static void main(String[] args) {
        int[] arr ={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start <end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                //desc part of array
                end = mid;
            }
            else{
                // asc part of array
                start= mid+1;
            }
        } return start;
    }
}
