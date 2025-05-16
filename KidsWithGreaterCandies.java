package com.ashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreaterCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            if(candy > max){
                max = candy;
            }

        }
        for(int candy:candies){
            res.add(candy+extraCandies >= max);
        }
        return res;
    }

}
