package edu.william.java.exceptions.desafio02.application;

import edu.william.java.exceptions.desafio02.model.Account;
import edu.william.java.exceptions.desafio02.model.exceptions.MyExceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine(); //limpando o buffer
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            System.out.print("Enter amount for withdraw: ");


            Account c1 = new Account(number, holder, balance,withdrawLimit);

            System.out.println();
            System.out.println(c1);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amountWithdraw = sc.nextDouble();

            c1.sacar(amountWithdraw);


        } catch (MyExceptions e ) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (Exception e){ //Pegando erro:
            System.out.println("Error: " + e);
        }



    }
}
