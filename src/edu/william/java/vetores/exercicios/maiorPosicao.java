package edu.william.java.vetores.exercicios;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int quantNumeros = input.nextInt();

        //declarando a array de n posições:
        double [] numreros = new double[quantNumeros];

        for (int i = 0; i < numreros.length ; i++) {
            System.out.print("Digite um numero: ");
            numreros[i] = input.nextDouble();
        }

        double maiorNumero = numreros[0];
        int posicaoMaior = 0;

        for (int i = 0; i < numreros.length; i++) {
            if (maiorNumero < numreros[i]) {
                maiorNumero = numreros[i];
                posicaoMaior = i;

            }
        }

        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);







        input.close();

    }
}
