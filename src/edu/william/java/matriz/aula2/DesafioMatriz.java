package edu.william.java.matriz.aula2;

import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo os valores de M e N
        int M = sc.nextInt();
        int N = sc.nextInt();

        // Criando a matriz de M linhas por N colunas
        int[][] matriz = new int[M][N];

        // Lendo os valores da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Lendo o valor de X
        int X = sc.nextInt();

        // Procurando as ocorrências de X na matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == X) {
                    System.out.printf("Posição %d,%d:%n", i, j);

                    // Verificando os valores à esquerda de X
                    if (j > 0) {
                        System.out.printf("Esquerda: %d%n", matriz[i][j-1]);
                    }

                    // Verificando os valores acima de X
                    if (i > 0) {
                        System.out.printf("Acima: %d%n", matriz[i-1][j]);
                    }

                    // Verificando os valores à direita de X
                    if (j < N-1) {
                        System.out.printf("Direita: %d%n", matriz[i][j+1]);
                    }

                    // Verificando os valores abaixo de X
                    if (i < M-1) {
                        System.out.printf("Abaixo: %d%n", matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
