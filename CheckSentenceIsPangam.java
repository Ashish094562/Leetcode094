package com.ashish;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSentenceIsPangam {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkSentenceIsPangam(sentence));
    }
    static boolean checkSentenceIsPangam(String sentence){
        boolean[] seen = new boolean[26];
        for(char c:sentence.toCharArray()){
            if(Character.isAlphabetic(c)){
                seen[Character.toLowerCase(c) - 'a'] = true;
            }
        }
        for (boolean letter : seen) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
