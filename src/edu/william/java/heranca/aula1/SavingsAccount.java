package edu.william.java.heranca.aula1;

public class SavingsAccount extends Account{


    private double interestRate;

    public SavingsAccount() {
        super();
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

    @Override //sobreposição de método
    public final void withdraw(double amount) {
       balance -= amount;
        System.out.println("\nSobreposição SavingsAccount");
    }



}
