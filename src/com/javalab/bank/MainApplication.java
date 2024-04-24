package com.javalab.bank;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManager manager = new BankManager();

        boolean running = true;
        while (running) {
            System.out.println("은행 계좌 관리 시스템");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌 조회");
            System.out.println("5. 모든 계좌 보기");
            System.out.println("6. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 입력 버퍼 클리어

            switch (choice) {
                case 1:
                    System.out.print("계좌 ID 입력: ");
                    String accountId = scanner.nextLine();
                    System.out.print("계좌 번호 입력 (-를 빼고 입력하세요): ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("초기 잔액 입력: ");
                    double initialBalance = scanner.nextDouble();
                    manager.createAccount(accountId, accountNumber, initialBalance);
                    break;
                case 2:
                    System.out.print("계좌 ID 입력: ");
                    accountId = scanner.nextLine();
                    System.out.print("입금 금액 입력: ");
                    double depositAmount = scanner.nextDouble();
                    manager.depositToAccount(accountId, depositAmount);
                    break;
                case 3:
                    System.out.print("계좌 ID 입력: ");
                    accountId = scanner.nextLine();
                    System.out.print("출금 금액 입력: ");
                    double withdrawalAmount = scanner.nextDouble();
                    manager.withdrawFromAccount(accountId, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("계좌 ID 입력: ");
                    accountId = scanner.nextLine();
                    Account account = manager.findAccount(accountId);
                    if (account != null) {
                        System.out.println("계좌 ID: " + account.getAccountId() + ", 잔액: " + account.getBalance());
                    } else {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }
                    break;
                case 5:
                    manager.printAllAccounts();
                    break;
                case 6:
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해 주세요.");
            }
        }

        scanner.close();
    }
}
