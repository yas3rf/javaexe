package com.company;

public class LastDigitChecker {
    public static void main(String[] args){
        //System.out.println(isValid(10));
        System.out.println(hasSameLastDigit(999,99,9));
    }
    public static boolean isValid(int number){
        if (number>=10 && number<=1000){
            return true;
        }else
            return false;
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;
        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)){
            if ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC)){
                    return true;
                }
            }
        return false;
    }
}
