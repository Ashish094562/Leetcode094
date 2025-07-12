package com.ashish;

public class ReverseBits {
    public static void main(String[] args) {
        String binaryStr = "00000010100101000001111010011100";
        int n = Integer.parseUnsignedInt(binaryStr, 2);
        int reversed = reverseBits(n);
        System.out.println(Integer.toBinaryString(reversed));
    }
    // you need treat n as an unsigned value
    static int reverseBits(int n) {
        int res =0;
        for(int i=0;i<32;i++){
            res <<=1;

            res |= (n & 1);
            n >>=1;
        }
        return res;
    }
}