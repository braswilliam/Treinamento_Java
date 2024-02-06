package edu.william.java.vetores.exercicios.hotel;

import java.util.Locale;
import java.util.Scanner;

public class AluguelTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Aluguel[] alugueis = new Aluguel[10];

        System.out.print("How many rooms will be rented? ");
        int quantClientes = input.nextInt();

        input.nextLine();

        int[] quartos = new int[quantClientes];

        for (int i = 0; i < quartos.length; i++) {
            System.out.println("\nRent #" + (i + 1) + ": ");
            System.out.print("Name: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Room: ");
            int quarto = input.nextInt();

            alugueis[quarto-1] = new Aluguel(nome, email, quarto ); //colocando exatamente na posição do vetor.

            input.nextLine();
        }

       System.out.println("\nBusy rooms:");
//        for (int i = 0; i < alugueis.length ; i++) {
//            if (alugueis[i] != null) {
//                System.out.println(alugueis[i].getQuarto() + ": " + alugueis[i].getNome() + ", " + alugueis[i].getEmail());
//            }
//        }

        for (Aluguel aluguel:alugueis) {
            if (aluguel != null) {
                System.out.println(aluguel.getQuarto() + ": " + aluguel.getNome() + ", " + aluguel.getEmail());
            }
        }






        input.close();


    }
}
