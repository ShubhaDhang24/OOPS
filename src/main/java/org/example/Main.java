package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----BANK ACCOUNT DETAILS-----");
        BankAccount bc = new BankAccount(123456 - 90, "Shubha D", 35000, 89090277, "shubhad@gmail.com");
        System.out.println(bc.bankInfo());
        System.out.println(bc.deposit(500));
        System.out.println(bc.withdraw(5000));

    }
}