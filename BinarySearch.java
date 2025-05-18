package com.ashish;

public class BinarySearch {
    public static void main(String[] args) {
        //array sorted in ascending order
        int[] arr={2,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=11;
        int ans=Search(arr,target);
        System.out.println(ans);

    }
    static int Search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                 end =mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
