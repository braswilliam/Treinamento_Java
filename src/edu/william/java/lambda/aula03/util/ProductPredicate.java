package edu.william.java.lambda.aula03.util;

import edu.william.java.lambda.aula03.entitie.Product;

import java.util.function.Predicate;

@FunctionalInterface
public interface ProductPredicate {

    public boolean test(Product p);

}
