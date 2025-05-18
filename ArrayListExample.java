package com.ashish;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(45);
//        list.add(12);
//        list.add(122);
//        list.add(123);
//        list.add(124);
//        System.out.println(list.contains(674));
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
