package edu.william.java.lambda.aula03.application;

import edu.william.java.lambda.aula03.entitie.Product;
import edu.william.java.lambda.aula03.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ProductTeste1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        Predicate<Product> filtra = product -> product.getPrice() >= 100.0;

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductPredicate p = new ProductPredicate(){
            @Override
            public boolean test(Product p) {
                return p.getPrice() >= 100;
            }
        };


        for (Product prod : list) {
            if (filtra.test(prod)) {
                System.out.println(prod.getName() + ", " + prod.getPrice());
            }
        }



    }
}
