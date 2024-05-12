package edu.william.java.generics.aula02.application;

import edu.william.java.generics.aula02.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> cookies = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("NoteBook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        cookies.put(p1,10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.00);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
        p1.setPrice(1000.00);
        System.out.println("Value p2: " + p1.getName());


    }
}
