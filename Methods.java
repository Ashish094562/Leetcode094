package com.ashish;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        sum1();
//        int value;
//        value = sum2();
//        System.out.println(value);
        int ans = sum3(12,12);
        System.out.println(ans);
}
    static int sum3(int a, int b){
        int sum= a+b;
        return sum;
    }

    static int sum2() {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        return num1 + num2;
    }

    static void sum1() {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
