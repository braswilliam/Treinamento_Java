package edu.william.java.lambda.aula05.application;

import edu.william.java.lambda.aula05.entitie.Product;
import edu.william.java.lambda.aula05.service.ToUppercaseNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductTeste02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        List<String> names = products.stream().map(Product::staticUppercase).toList();

        names.forEach(System.out::println);


    }
}
