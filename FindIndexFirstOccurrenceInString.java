package com.ashish;

public class FindIndexFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
