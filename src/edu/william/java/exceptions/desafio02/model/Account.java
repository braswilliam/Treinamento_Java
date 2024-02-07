package edu.william.java.exceptions.desafio02.model;

import edu.william.java.exceptions.desafio02.model.exceptions.MyExceptions;

public class Account {

    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account(int number, String holder, Double balance, Double withdrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //Depositar:
    public void deposit(double amount) {
        this.balance += amount;
    }

    //Sacar
    public void sacar(double amount) {

        if (!(amount > 0 && amount <= withdrawLimit)) {
            throw new MyExceptions("The amount exceeds withdraw limit");
        } else if (this.balance < amount) {
            throw  new MyExceptions("Not enough balance");
        }

        else {
            this.balance -= amount;
            System.out.printf("New balance: %.2f",  this.balance);
        }
    }


    @Override
    public String toString() {
        return "\nInformações da conta:" +
                "\nNumber: " + this.number
                + "\nHolder: " + this.holder
                + "\nBalance: " + this.balance;
    }
}
