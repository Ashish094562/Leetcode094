package com.ashish;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("local variable a ="+a+" b ="+b);
        {
            a=19;
            b=45;
            int c =56;
            System.out.println("local to this block variable a ="+a+" b ="+b+" c ="+c);
        }
        global();
    }
    static void global(){
        int a=40;
        int b=50;
        System.out.println("local to this function variable a ="+a+" b ="+b);
    }
}
