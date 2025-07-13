package com.ashish;

class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        if (num==0){
            return 0;
        }
        if(num%2==0){
            return 1+ numberOfSteps(num/2);
        }
        else{
            return 1+ numberOfSteps(num-1);
        }
    }
}