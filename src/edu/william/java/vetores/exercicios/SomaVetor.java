package edu.william.java.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int quantidadeNumeros = input.nextInt();

        double [] numeros = new double[quantidadeNumeros];

        double total = 0;
        int contador = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i+1) + ": ");
            numeros[i] += input.nextDouble();
            total += numeros[i];
        }

        System.out.print("VALORES = ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        System.out.printf("TOTAL = %.2f%n",  total);
        System.out.printf("MEDIA = %.2f%n",  (total / numeros.length));


    }
}
