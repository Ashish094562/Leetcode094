package com.ashish;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraylistMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        input(list);
        System.out.println("Enter target :");
        int target = sc.nextInt();
        int[] res = new int[2];
        res=minMax(list);
        System.out.println(list);
        System.out.println("min value :"+res[0]);
        System.out.println("max value :"+res[1]);
        System.out.println("Target found-True/Not -False :"+check(list,target));
    }
    static void input(ArrayList<Integer> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter number :");
            list.add(sc.nextInt());
        }
    }
    static int[] minMax(ArrayList<Integer> list){
        if(list.isEmpty()){
            return new int[]{-1,-1};
        }
        int min=list.get(0);
        int max=list.get(0);
        for(int num:list){
            if(num>min){
                min=num;
            }
        }
        for(int num:list){
            if(num<max){
                max=num;
            }
        }
        return new int[]{max,min};
    }
    static boolean check(ArrayList<Integer> list,int target){
        if(list.isEmpty()){
            return false;
        }
        for(int num:list){
            if(num==target){
                return true;
            }

        }
        return false;
    }
}
