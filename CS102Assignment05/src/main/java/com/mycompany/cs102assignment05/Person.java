/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment05;

import java.util.ArrayList;

/**
 *
 * @author jehuv
 */
public class Person {
    private String name;
    private int age;
    
    private ArrayList<BankAccount> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void openCheckingAccount(double fundsFee, double balance)
    {
        if(this.age >= 18)
        {
            CheckingAccount newAccount = new CheckingAccount(fundsFee, this.name, balance);
            this.accounts.add(newAccount);
        }
        else
        {
            System.out.println("This person isn't old enough for a Checking Account. Their parents will need to do it for them.");
        }
    }
    
    public void openSavingsAccount(double interestRate, double balance)
    {
        if(this.age >= 18)
        {
            SavingsAccount newAccount = new SavingsAccount(interestRate, this.name, balance);
            this.accounts.add(newAccount);
        }
        else
        {
            System.out.println("This person isn't old enough for a Savings Account. Their parents will need to do it for them.");
        }
    }
}
