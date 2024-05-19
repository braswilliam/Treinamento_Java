package edu.william.java.lambda.aula05.application;

import edu.william.java.lambda.aula05.entitie.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ProductTeste06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        Function<Product, String> toUppercase = product -> product.getName().toUpperCase();
        Function<String, String> entusiasmado = product -> product + "!!!";

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        List<String> names = products.stream().map(toUppercase.andThen(entusiasmado)).toList();

        names.forEach(System.out::println);


    }
}
