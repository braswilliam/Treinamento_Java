package edu.william.java.heranca.aula6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int qtTaxer = sc.nextInt();


        for (int i = 1; i <= qtTaxer ; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Idividual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberEmployees));
            }




        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tx : list) {
            System.out.println(tx.getName() + " $ " + String.format("%.2f",tx.tax()));
        }


        System.out.println();
        System.out.println("TAXES PAID:");
        double total = 0;
        for (TaxPayer tx : list) {
            total += tx.tax();
        }

        System.out.println("TOTAL TAXES: " + String.format("%.2f", total));



        sc.close();




    }

}
