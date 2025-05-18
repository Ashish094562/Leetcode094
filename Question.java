package com.ashish;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(isPrime(n));
        for (int i=100;i<=1000;i++) {
            if(ArmStrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    // printing all the 3 digit armstrong number
    static boolean ArmStrong(int n){
        int sum=0,rem,original=n;
        while(n>0){
            rem =n%10;
            sum=sum+rem*rem*rem;
            n=n/10;

        }
        return sum==original;
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c=c+1;
        }
        return c*c>n;
    }
}
