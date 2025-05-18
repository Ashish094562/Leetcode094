package com.ashish;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        primitive datatype
//        int[] ros= new int[20];
//        String[] arr= new String[20];
//        ros[0]=1;
//        ros[1]=2;
//        ros[2]=3;
//        ros[3]=4;
//        ros[4]=5;
//        arr[0]="a";
//        arr[1]="b";
//        arr[2]="c";
//        arr[3]="d";
//        arr[4]="e";
//        System.out.println(ros[2]);
//        System.out.println(arr[2]);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter number " + (i + 1)+":");
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Number " + (i + 1) + ": " + arr[i]);
//
//        }
//        for(int num : arr){
//            System.out.print(num+" ");
//        }
//        System.out.println(Arrays.toString(arr));
//        non - primitive /objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
