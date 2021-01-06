package com.company;

public class FirstAndLastDigits {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigits(125));

    }
    public static int sumFirstAndLastDigits(int number){
        int firstDigit = 0;
        int lastDigit=0;
        if (number>=0 && number<9) {
            return number + number;
        }
        else if(number>9){
            lastDigit=number%10;
            while (number>0){
                number/=10;
                if (number<=9 && number>0){
                    firstDigit=number;
                }
            }
        return firstDigit+lastDigit;
        }else
            return -1;
    }
}
