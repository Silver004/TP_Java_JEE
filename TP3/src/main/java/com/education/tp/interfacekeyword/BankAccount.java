package com.education.tp.interfacekeyword;

public class BankAccount implements Account{
    private String number;
    private int balance;
    public BankAccount(String number){
        this.number = number;
    }
    @Override
    public void deposit(int amount){
        this.balance += amount;
    }
    @Override
    public int withdraw(int amount){
        if(balance < amount){
            return 0;
        }
        return this.balance -= amount;
    }
    @Override
    public int getBalance(){
        return this.balance;
    }

    public String getNumber() {
        return number;
    }
}
