package com.javalab.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankApplication extends JFrame {
    private BankManager manager;
    private JTextField accountIdField;
    private JTextField accountNumberField;
    private JTextField balanceField;
    private JTextArea outputArea;

    public BankApplication() {
        // JFrame 설정
        setTitle("은행 계좌 관리 시스템");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // BankManager 초기화
        manager = new BankManager();

        // 입력 패널 생성
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        // 계좌 ID 입력 필드
        inputPanel.add(new JLabel("계좌 ID:"));
        accountIdField = new JTextField();
        inputPanel.add(accountIdField);

        //계좌 번호 입력 필드
        inputPanel.add(new JLabel("계좌 번호::"));
        accountNumberField = new JTextField();
        inputPanel.add(accountNumberField);


        // 초기 잔액 입력 필드
        inputPanel.add(new JLabel("초기 잔액:"));
        balanceField = new JTextField();
        inputPanel.add(balanceField);

        // 생성 버튼
        JButton createButton = new JButton("계좌 생성");
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String accountId = accountIdField.getText();
                String accountNumber = accountNumberField.getText(); // 계좌 번호 필드에서 값을 읽어옴
                double initialBalance = Double.parseDouble(balanceField.getText());
                manager.createAccount(accountId, accountNumber, initialBalance); // 계좌 생성 메소드 호출 시 계좌 번호 전달
                outputArea.append("계좌 생성: " + accountId + " 계좌번호 : " + accountNumber + " (잔액: " + initialBalance + ")\n");
            }
        });
        inputPanel.add(createButton);

        add(inputPanel, BorderLayout.NORTH);

        // 출력 영역 생성
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankApplication app = new BankApplication();
            app.setVisible(true);
        });
    }
}