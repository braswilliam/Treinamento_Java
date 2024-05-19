package edu.william.java.lambda.aula04.service;

import edu.william.java.lambda.aula04.entitie.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
