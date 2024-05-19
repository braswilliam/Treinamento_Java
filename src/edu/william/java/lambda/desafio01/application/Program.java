package edu.william.java.lambda.desafio01.application;

import edu.william.java.lambda.desafio01.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // /home/will/Documentos/in2.txt
        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }


            //pipelines:

           double avg = list.stream()
                   .map(Product::getPrice)
                   .reduce(0.0, Double::sum) / list.size();

            System.out.printf("Average Price: %.2f%n", avg);

            Comparator<String> comp = String::compareToIgnoreCase;

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName).sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();


    }
}
