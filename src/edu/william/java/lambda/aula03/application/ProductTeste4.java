package edu.william.java.lambda.aula03.application;

import edu.william.java.lambda.aula03.entitie.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductTeste4 {

    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(Product::nonStaticProductPredicate); //method reference

        list.forEach(System.out::println);


    }

}
