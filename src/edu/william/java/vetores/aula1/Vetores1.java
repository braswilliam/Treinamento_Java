package edu.william.java.vetores.aula1;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {
      public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o nomero de pessoas: ");
        int pessoas = input.nextInt();

        double [] alturas = new double [3];
        
        double acumulador = 0;
        int cont = 1;
        for (double altura : alturas) {
            System.out.print("Informe a altura da " + cont + "ª pessoa: " );
            acumulador += input.nextDouble();
            cont++;
        }
        
        double media = acumulador / alturas.length;

        System.out.printf("\n\nA média de altura é: %.2f%n%n", media);

        input.close();
      }
}
