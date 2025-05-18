package com.ashish;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        a=20;
        b=30;
        swap(a,b);
        System.out.println("a ="+a+" b ="+b);
//        System.out.println("befor swap a="+a+" b="+b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("after swap a="+a+" b="+b);


    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
