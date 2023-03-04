package edu.william.java.heranca.aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));

        double sum = 0.0;

        for(Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total Balance: %.2f", sum);

        //depositando  10.00 em cada conta:
        System.out.println();
        for (Account acc : list) {
            acc.deposit(10.00);
        }

        //imprimindo o saldo de cada conta:
        System.out.println();
        for(Account acc : list) {

            System.out.printf("Updated balance for account %d : %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }

}
