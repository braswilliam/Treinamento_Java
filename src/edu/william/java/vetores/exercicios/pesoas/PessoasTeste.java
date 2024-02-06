package edu.william.java.vetores.exercicios.pesoas;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class PessoasTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = input.nextInt();

        input.nextLine(); //limpando o buffer de entrada.

        Pessoa[] pessoas = new Pessoa[quantidadePessoas];
        
        double totalAltura = 0.0;


        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            String nome = input.nextLine();



            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Altura: ");
            double altura = input.nextDouble();

            input.nextLine();//limpando o buffer de entrada.

            pessoas[i] = new Pessoa(nome, idade, altura);

            totalAltura += altura;

            System.out.println();
        }

        double menorDezeseis = 0;


        for (Pessoa p : pessoas) {
            if (p.getIdade() < 16) {
                menorDezeseis++;
            }
        }

        System.out.printf("A altura média é: %.2f%n", (totalAltura / pessoas.length));
        double media = (menorDezeseis * 100) / pessoas.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", media );

        for (Pessoa p:pessoas) {
            if (p.getIdade() < 16) {
                System.out.println(p.getNome());
            }
        }

    }
}
