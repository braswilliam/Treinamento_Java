package edu.william.java.heranca.aula1;

public class SavingsAccount extends Account{


    public double interestRate;


    public SavingsAccount() {
        super
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public void updateBalance() {
        this.balance += this.balance * this.interestRate;
    }

}
