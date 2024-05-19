package edu.william.java.lambda.aula05.service;

import edu.william.java.lambda.aula05.entitie.Product;

import java.util.function.Function;

public class ToUppercaseNames implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
