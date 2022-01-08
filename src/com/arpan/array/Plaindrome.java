package com.arpan.array;

public class Plaindrome {
public static void main(String[] args) {
	System.out.println(isPalindrome(-121));
}
public static boolean isPalindrome(int x) {
    int num=x;
    int rev=0;
    while(x!=0){
        int temp=x%10;
        rev=rev*10+temp;
        x=x/10;
    }
    return rev==num;
}
}
