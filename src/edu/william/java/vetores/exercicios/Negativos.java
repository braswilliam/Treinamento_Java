package edu.william.java.vetores.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numerosDigitados = input.nextInt();

        int numeros [] = new int [numerosDigitados];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }


        input.close();
    }
}
