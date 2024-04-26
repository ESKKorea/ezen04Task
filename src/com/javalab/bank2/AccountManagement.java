package com.javalab.bank2;

public interface AccountManagement {
    void addAccount(Account account);
    void printAllAccounts();
    Account findAccountById(String accountId);
    void deposit(String accountId, double amount);
    void withdraw(String accountId, double amount);
}