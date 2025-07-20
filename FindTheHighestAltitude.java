package com.ashish;

class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int max=0,current=0;
        for(int i : gain){
            current+=i;
            if(current>max){
                max=current;
            }
        }
        return max;
    }
}