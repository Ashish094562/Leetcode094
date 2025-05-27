package com.ashish;

public class DivisibleAndNonDivisibleSumsDifference {
    public static void main(String[] args) {
        int n=10,m=3;
        System.out.println(differenceOfSums(n,m));
    }
    static int differenceOfSums(int n, int m) {
        int num1=0,num2=0;
        int tsum = n*(n+1)/2;
        int k = n/m;
        num2 = m*k*(k+1)/2;
        num1 = tsum - num2;
        return num1 -num2;
        //    int num1=0,num2=0;
        //    for (int i=1;i<=n;i++){
        //     if (i%m!=0){
        //     num1+=i;
        //     }else{
        //         num2+=i;
        //     }

        //    }
        //    return num1-num2;

        //
    }
}
