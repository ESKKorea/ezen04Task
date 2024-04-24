package com.javalab.bank;

public class Account {
    private String accountId;
    private String accountNumber;
    private double balance;


    public Account(String accountId, String accountNumber, double initialBalance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 원 입금되었습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("금액이 유효하지 않습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " 원 출금되었습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("출금할 금액이 잔액을 초과하거나 유효하지 않습니다.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountNumber(){
        return accountNumber;
    }


}