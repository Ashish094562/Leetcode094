package com.ashish;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }
    static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            int temp = columnNumber - 1;
            int rem = temp%26;
            sb.append((char) ('A'+rem));
            columnNumber=temp/26;
        }
        return sb.reverse().toString();
    }
}
