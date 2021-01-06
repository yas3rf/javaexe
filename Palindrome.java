package com.company;

public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-111));
    }
    public static boolean isPalindrome(int number){
        int rem,reverse=0,temp;
        temp= number;
        while (number!=0){
            rem=number%10;
            reverse=(reverse*10)+rem;
            number/=10;
        }
        if (temp==reverse){
            System.out.println(temp+" "+reverse);
            return
                    true;
        }
        else
            return
                    false;
    }
}
