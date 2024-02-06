package edu.william.java.vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanho = input.nextInt();

        double [] notas = new double[tamanho];

       double acumulador = 0.0;
        for (int i = 0; i < notas.length ; i++) {
            System.out.print("Digite um numero: ");
            notas[i] = input.nextDouble();
            acumulador += notas[i];
        }

        System.out.printf("MEDIA DO VETOR = %.3f%n", acumulador / notas.length);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (double nota:notas) {
            if (nota <= 10.0) {
                System.out.println(nota);
            }
        }

        input.close();

    }
}
