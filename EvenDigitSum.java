package com.company;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number) {
        int lastDigit;
        int evenDigitSum =0;
        if (number>=0){
        while (number>0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number /= 10;
        }
        }else
            return -1;
        return evenDigitSum;
    }
}