package edu.william.java.compisicao.aula3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = sc.nextLine().toUpperCase();

        System.out.print("How many items to this order? ");
        int quantityItems = sc.nextInt();


        Oder order = new Oder(new Date(),OrderStatus.valueOf(status),new Client(name,email,birthDate));

        sc.nextLine();

        for (int i = 1; i <= quantityItems ; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            sc.nextLine();


            OrderItem orderItem = new OrderItem(productQuantity, priceProduct, new Product(nameProduct,priceProduct));
            order.addItem(orderItem);
        }


        System.out.println(order);

        sc.close();



    }


}
