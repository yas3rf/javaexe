package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(int amount){
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + (balance = balance + amount));
    }
    public void withdraw(int amount){
        if (getBalance()>amount) {
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Balance: " + (balance = balance - amount));
        }else
            System.out.println("You don't have sufficient amount in your balance");
    }

}
