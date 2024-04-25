package com.javalab.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankManager {
    private List<Account> accounts;

    public BankManager() {
        this.accounts = new ArrayList<>();
    }
    public void createAccount(String accountId, String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountId, accountNumber, initialBalance);
        accounts.add(newAccount);
        System.out.println("새 계좌가 생성되었습니다");
        System.out.println("계좌 고유ID : " + accountId);
        System.out.println("계좌 번호 : "+ accountNumber);
        System.out.println("계좌 잔액 : "+ initialBalance);
    }

    public Account findAccount(String accountId) {
        for (Account account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }
        System.out.println("계좌를 찾을 수 없습니다.");
        return null;
    }

    public void depositToAccount(String accountId, double amount) {
        Account account = findAccount(accountId);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void withdrawFromAccount(String accountId, double amount) {
        Account account = findAccount(accountId);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public void printAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
        } else {
            System.out.println("등록된 계좌 목록:");
            for (Account account : accounts) {
                System.out.println("계좌 ID: " + account.getAccountId() + "계좌 번호 : " + account.getAccountNumber()+ ", 잔액: " + account.getBalance());
            }
        }
    }



}