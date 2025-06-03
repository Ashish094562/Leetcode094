package com.ashish;

public class ReverseInteger {
    public static void main(String[] args) {
        int x=123;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        int rev=0,rem,original=x;
        while(x!=0){
            rem = x%10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && rem>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && rem<-8)){
                return 0;
            }
            rev=rev*10+rem;
            x/=10;
        }
        return rev;
    }
}
