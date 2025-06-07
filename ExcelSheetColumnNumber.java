package com.ashish;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
    }
    static int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int num = ch - 'A'+1;
            res = res*26 + num;
        }
        return res;
    }
}
