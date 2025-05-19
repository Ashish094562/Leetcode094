package com.ashish;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start=1,end =n;

        while (start < end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else  {
                start = mid + 1;
            }
        }
        return start;

    }
}
