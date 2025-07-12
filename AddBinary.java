package com.ashish;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1,j=b.length()-1,carry=0;
        while (i>=0 || j>=0 || carry !=0){
            int bitA = (i>=0)? a.charAt(i--)-'0':0;
            int bitB = (j>=0)? b.charAt(j--)-'0':0;
            int sum = bitA + bitB+carry;
            res.append(sum%2);
            carry=sum/2;

        }
        return res.reverse().toString();
    }

}
