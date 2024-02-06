package edu.william.java.matriz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Mario");
        list.add("Macos");



        for (String x:list) {
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'M'); //remova tudo que começar com M


        System.out.println("\n--------------------------\n");
        for (String x:list) {
            System.out.println(x);
        }

        System.out.println("Index of " + list.indexOf("Bob"));
        System.out.println("Index of " + list.indexOf("Marco"));

        System.out.println("\n--------------------------\n");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //filtrando pela letra A

        for (String x:result) {
            System.out.println(x);
        }

        System.out.println("\n--------------------------\n");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);


        
    }
}
