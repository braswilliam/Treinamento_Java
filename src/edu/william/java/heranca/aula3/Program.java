package edu.william.java.heranca.aula3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for (int i = 1; i <= numberProducts; i++) {

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

           if (ch == 'i') {
               System.out.print("Customs fee: ");
               double customFree = sc.nextDouble();

               Product prod = new ImportedProduct(name, price, customFree);
               products.add(prod);

           } else if(ch == 'c'){
               Product prod = new Product(name, price);
               products.add(prod);
           } else {
               System.out.print("Manufacture date (DD/MM/YYYY): ");
               Date manufactureDate = sdf.parse(sc.next());

               Product prod = new UsedProduct(name, price, manufactureDate);
               products.add(prod);
           }

        }


        System.out.println("\nPRICE TAGS:");
        for (Product product:products) {
            System.out.println(product.pricetag());
        }

        sc.close();
    }
}
