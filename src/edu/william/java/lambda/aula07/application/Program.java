package edu.william.java.lambda.aula07.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, Integer::sum); //somatório da lista
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) //filtra os pares
                .map(x -> x * 10) //multiplica por 10 cada um deles
                .toList(); //transforma em lista
        System.out.println(Arrays.toString(newList.toArray()));// imprime em forma de array

    }
}
