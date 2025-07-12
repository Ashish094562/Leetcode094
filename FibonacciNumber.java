package com.ashish;

class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
    static int fib(int n) {
       double sqrt5 = Math.sqrt(5);
       double p = (1+sqrt5)/2;
       double ne = (1-sqrt5)/2;
       return (int) Math.round((Math.pow(p,n)-Math.pow(ne,n))/sqrt5);
    }
}