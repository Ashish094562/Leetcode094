package com.ashish;

import java.util.Scanner;

public class StringExampleMethod {
    public static void main(String[] args) {
//
//        String message= greet();
//        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello "+ name ;
        return message;
    }

    static String greet(){
        return "Hello World";
    }
}
