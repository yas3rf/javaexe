package com.company;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year>1 && year<9999)
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        else
            return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month<1 || month>12) || (year<1 || year>9999)){
            return -1;
        }
        boolean leap;
        leap=isLeapYear(year);
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                if(leap)
                    System.out.println("29");
                else System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Wrong");
        }
        return 0;
    }
    public static void main(String[] args){
        getDaysInMonth(1,2020);
    }
}
