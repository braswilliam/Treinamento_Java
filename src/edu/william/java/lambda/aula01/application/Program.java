package edu.william.java.lambda.aula01.application;

import edu.william.java.lambda.aula01.entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        for (Product p : list) {
            System.out.println(p.toString());
        }

    }
}
