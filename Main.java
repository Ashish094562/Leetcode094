package com.ashish;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

         */
        int salary = 25000;
        if (salary>10000){
            salary+=2000;
        }
        else if (salary<1000){
            salary+=500;
        }
        else {
            salary+=1000;
        }
        System.out.println("Salary is: "+salary);
        }
    }
