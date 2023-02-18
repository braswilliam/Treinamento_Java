package edu.william.java.matriz.aula1;

import java.util.Scanner;

public class MatrizDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas e colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int negativeNumbers = 0;

        for (int i = 0; i < mat.length; i++) { //linha
            for (int j = 0; j < mat[i].length; j++) { //coluna
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.print("\nMain diagonal: " + "= ");
        for (int i = 0; i < mat[i].length; i++) {
            System.out.print(mat[i][i] + " ");

        }

        System.out.println();
        System.out.println("Negative Numbers: " + negativeNumbers + "\n");

        sc.close();



    }
}
