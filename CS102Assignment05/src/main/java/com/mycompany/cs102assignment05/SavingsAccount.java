/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment05;

/**
 *
 * @author jehuv
 */
public class SavingsAccount extends BankAccount{
    private double annualInterestRate;

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public SavingsAccount(double annualInterestRate, String owner, double balance) {
        super(owner, balance);
        this.annualInterestRate = annualInterestRate;
    }
    
    public void depositMonthlyInterest()
    {
       this.deposit(this.getBalance() * (this.annualInterestRate) / 12.0);
    }
    
    @Override
    public void withdraw(double amount)
    {
        if(this.getBalance() - amount > 0)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Error: withdrawal would exceed account balance.");
        }
    }
}
