package com.ashish;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int child =0;
        int cookie =0;
        while(child<g.length && cookie<s.length){
            if(s[cookie]>=g[child]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}
