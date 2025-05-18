package com.ashish;

public class Shadowing {
    static int x =90; // this will be shadowed in line number 8
    public static void main(String[] args) {
        System.out.println("x ="+x);//90
        int x=40;//class variable at line 4 is shadowed by this
        System.out.println("x ="+x);//40
        fun();
    }
    static void fun(){
        System.out.println("x ="+x);
    }
}
