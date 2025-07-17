package com.ashish;

import java.util.ArrayList;
import java.util.List;

class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
    static void backtrack(int[] candidates,int start,int target,List<Integer> current, List<List<Integer>> res){
        if (target ==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=start ;i<candidates.length;i++){
            if(candidates[i]> target){
                continue;
            }
            current.add(candidates[i]);
            backtrack(candidates,i,target - candidates[i],current,res);
            current.remove(current.size() - 1);
        }
    }
}