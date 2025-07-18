package com.ashish;

class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i =0;i<patterns.length;i++){
            if(word.indexOf(patterns[i])!=-1){
                count++;
            }
        }
        return count;
    }
}