/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cs102assignment05;

/**
 *
 * @author jehuv
 */
public class MainClass {

    public static void main(String[] args) {
        SavingsAccount joesAccount = new SavingsAccount(0.01, "Joe", 100);
        CheckingAccount emilysAccount = new CheckingAccount(10, "Emily", 200);
        emilysAccount.deposit(50);
        joesAccount.withdraw(25);
        emilysAccount.processCheck(50);
        emilysAccount.withdraw(100);
        joesAccount.deposit(100);
        SavingsAccount samsAccount = new SavingsAccount(0.005, "Sam", 250);
        joesAccount.depositMonthlyInterest();
        samsAccount.depositMonthlyInterest();
        emilysAccount.withdraw(500);
        joesAccount.withdraw(500);
    }
}
