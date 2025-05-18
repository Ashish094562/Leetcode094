package com.ashish;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1 -> System.out.println("ashish singh");
            case 2 -> System.out.println("rahul");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Department not found");
                }
            }
            default -> System.out.println("ID not found");
        }
    }
}
