/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment05;

/**
 *
 * @author jehuv
 */
public class BankAccount {
    private String owner;
    private double balance;
    
    public String getOwner()
    {
        return this.owner;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        this.balance += amount;
    }
    
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
}
