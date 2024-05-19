package edu.william.java.lambda.aula02.application;

import edu.william.java.lambda.aula01.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort(Program::compareProducts);

        System.out.println(list);

    }
}
