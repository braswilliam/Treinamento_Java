package edu.william.java.vetores.exercicios.velhos;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Quantas pessoas voce vai digitar? ");
        int tamanho = input.nextInt();

        Pessoa[] pessoas = new Pessoa[tamanho];

        input.nextLine(); //limpando Buffer

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            input.nextLine(); //limpando Buffer

            pessoas[i] = new Pessoa(nome, idade);

            System.out.println();
        }

        String nomeMaiVelho = "";
        int idadeMaisVelho = 0;
        for (int i = 0; i < pessoas.length ; i++) {
            if (idadeMaisVelho < pessoas[i].getIdade()) {
                idadeMaisVelho = pessoas[i].getIdade();
                nomeMaiVelho = pessoas[i].getNome();

            }
        }

        System.out.println("PESSOA MAIS VELHA: " +nomeMaiVelho + " com " + idadeMaisVelho + " anos.");




        input.close();
    }
}
