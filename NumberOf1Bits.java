package com.ashish;

class NumberOf1Bits {
    public static void main(String[] args) {
        int num=11;
        System.out.println(hammingWeight(num));
    }
    static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n & 1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}