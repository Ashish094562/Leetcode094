package com.ashish;

public class OrderAgnosticsBinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr1={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int target=11;
        int ans = orderAgnosticBs(arr,target);
        int ans1=orderAgnosticBs(arr1,target);
        System.out.println("For ascending :"+ans);
        System.out.println("for descending :"+ans1);
    }
    static int orderAgnosticBs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc=arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end =mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
