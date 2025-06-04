package com.ashish;

public class heckBalancedString {
    public static void main(String[] args) {
        String num = "1234";
        System.out.println(isBalanced(num));
    }
    static boolean isBalanced(String num) {
        int EvenSum=0,OddSum=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0)
                EvenSum+=(int) num.charAt(i) - '0';
            else
                OddSum+=(int) num.charAt(i) -'0';
        }
        return EvenSum==OddSum;
    }
}
