/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment05;

/**
 *
 * @author jehuv
 */
public class CheckingAccount extends BankAccount {
    private double insufficientFundsFee;

    public double getInsufficientFundsFee() {
        return insufficientFundsFee;
    }

    public void setInsufficientFundsFee(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public CheckingAccount(double insufficientFundsFee, String owner, double balance) {
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }
    
    public void processCheck(double checkAmount)
    {
        this.deposit(checkAmount);
    }
    
    @Override
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        if(this.getBalance() < 0)
        {
            super.withdraw(this.insufficientFundsFee);
        }
    }
}
