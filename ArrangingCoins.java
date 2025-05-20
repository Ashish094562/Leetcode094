package com.ashish;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }
    static int arrangeCoins(int n) {
        long start =0,end = n;
        while (start<=end){
            long mid = start +(end - start)/2;
            long coinused = mid* (mid+1)/2;
            if (coinused==n){
                return (int) mid;
            }
            else if(coinused<n){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }return (int) end;
    }
}
