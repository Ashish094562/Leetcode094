package com.ashish;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    static String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        int i=0;
        while (i<s.length()){
            if((i+2)<s.length() && s.charAt(i+2)=='#'){
                int num = Integer.parseInt(s.substring(i,i+2));
                res.append((char) ('a' + num-1));
                i+=3;
            }
            else {
                int num = s.charAt(i) -'0';
                res.append((char) ('a' + num-1));
                i++;
            }
        }
        return res.toString();
    }
}
