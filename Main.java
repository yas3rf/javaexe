package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int count = 0;
        int sum = 0;
        for (i=1; i<=1000; i++){
            if (i%3==0 && i%5==0){
                count ++;
                sum += i;
                System.out.println("the found numbers are: " + i);
            }
            if (count == 5)
                break;
        }
        System.out.println("the sum = " + sum);
    }
}
