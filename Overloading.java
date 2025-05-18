package com.ashish;

public class Overloading {
    public static void main(String[] args) {
        fun(23);
        fun("ashish");
        int ans=sum(2,4,5);
        System.out.println(ans);

    }
    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a, int b, int c) {

        return a + b + c;
    }
    static void fun(int a){
        System.out.println("x ="+a);
    }
    static void fun(String name){
        System.out.println("x ="+name);
    }
}
