package edu.william.java.lambda.aula04.application;

import edu.william.java.lambda.aula04.entitie.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProductTeste05 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        products.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        products.forEach(System.out::println);
    }
}
