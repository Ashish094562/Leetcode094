package com.ashish;


import java.util.Arrays;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String name = "ashish";
        char target = 'i';
        //System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(linear(name,target));
        System.out.println(linear2(name,target));
    }
    public static boolean linear(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static boolean linear2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch :  str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
        }

    }

