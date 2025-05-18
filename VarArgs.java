package com.ashish;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,4,5,6,7,8,89);
//        multiple(2,3,"ashish","rahul","mahesh");
      demo(2,4,5);
      demo("ashish","rahul","mahesh");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
