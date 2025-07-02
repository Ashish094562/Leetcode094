package com.ashish;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        int leftcount =0,rightcount=0;
        for (int i = 0; i < s.length()/2; i++) {
            if(check(s.charAt(i))){
                leftcount++;
            }
        }
        for (int j = s.length()/2; j <s.length() ; j++) {
            if(check(s.charAt(j))){
                rightcount++;
            }
        }
        return leftcount==rightcount;

    }
    static boolean check(char ch){
        return switch (ch) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

}
