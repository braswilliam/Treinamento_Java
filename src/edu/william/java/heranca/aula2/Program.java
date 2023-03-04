package edu.william.java.heranca.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharg = sc.nextDouble();
                Employee emp = new OutsourcedEmployees(name, hours, valuePerHour, additionalCharg);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }


        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
        }


        sc.close();

    }
}
