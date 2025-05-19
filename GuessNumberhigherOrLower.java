package com.ashish;
// guess is a function defined in leetcode use accoding to that
public class GuessNumberhigherOrLower {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,11,13,15,17};
        int n=10,pick=6;

    }
    static int guessNumber(int[] arr,int n) {
        int start=0,end =n;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            int res= guess(mid);
            if(res==0){
                return mid;
            }
            else if (res<0) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return -1;
    }
}
