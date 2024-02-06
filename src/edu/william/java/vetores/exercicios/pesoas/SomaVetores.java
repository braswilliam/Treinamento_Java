package edu.william.java.vetores.exercicios.pesoas;


import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Quantos valores vai ter cada vetor? ");
        int tamanho = input.nextInt();

        int [] vetorA = new int[tamanho];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length ; i++) {
            vetorA[i] = input.nextInt();
        }


        int [] vetorB = new int[tamanho];
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorB.length ; i++) {
          vetorB[i] = input.nextInt();
        }


        int [] somaPosicoes = new int[tamanho];
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < somaPosicoes.length ; i++) {
            somaPosicoes[i] = vetorA[i] + vetorB[i];
        }

        for (int result:somaPosicoes) {
            System.out.println(result);
        }

        input.close();
    }
}
