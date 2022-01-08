package com.arpan.array;

public class ReverseTheNumber {
	public static int reverse(int x) {
		Long z=(long) x;
        long rev=0;
        while(z!=0){
            long temp=z%10;
            rev=rev*10+temp;
            z=z/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
        	return 0;
        }
        return (int) rev;
    }
	public static void main(String[] args) {
		System.out.println(reverse(-120));
	}
}
