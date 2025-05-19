package com.ashish;

public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);

    }

    static boolean checkIfPangram(String sentence) {
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
