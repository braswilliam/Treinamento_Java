package edu.william.java.heranca.aula4;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amout) {
        if (amout <= this.loanLimit){
            balance += amout - 10.0;
        }
    }


    public final void withdraw(double amount) {
        System.out.println("\nSobreposição BusinessAccount");
        //super.withdraw(amount);
        balance -= amount - 2.0;

    }
}
