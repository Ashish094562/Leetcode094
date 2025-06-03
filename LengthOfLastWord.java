package com.ashish;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        int start =0;
        int end = s.length()-1;
        while(end>=0 && s.charAt(end)==' '){
            end--;
        }
        while(end>=0 && s.charAt(end) !=' '){
            start++;
            end--;
        }
        return start;
    }
}

