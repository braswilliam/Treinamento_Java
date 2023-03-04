package edu.william.java.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanho = input.nextInt();


        double[] numeros = new double[tamanho];

        int qPares = 0;
        double acumuladorPares = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextDouble();
        }


        for (double numero:numeros) {
            if (numero % 2 == 0) {
                acumuladorPares += numero;
                qPares++;
            }
        }

        if (qPares > 0 ) {
            System.out.printf("\nMEDIA DOS PARES = %.1f%n", acumuladorPares/qPares);
        } else {
            System.out.println("\nNENHUM NUMERO PAR");
        }

        input.close();
    }
}
