package edu.william.java.vetores.exercicios.dados;



import java.util.Locale;
import java.util.Scanner;

public class Dadosteste {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Quantas pessoas serao digitadas? ");
        int qPessoas = input.nextInt();

        DadosPessoas[] pessoas = new DadosPessoas[qPessoas];


        for (int i = 0; i < pessoas.length ; i++) {
            System.out.print("Altura da " + (i + 1) + " a pessoa:");
            double altura = input.nextDouble();
            System.out.print("Genero da " + (i + 1) + " a pessoa:");
            char genero = input.next().charAt(0);


            pessoas[i] = new DadosPessoas(altura, genero);

        }


        double menorAutura = pessoas[0].getAltura();
        double maiorAltura = pessoas[0].getAltura();
        double acumuladroAlturaMulheres = 0.0;
        int quantidadeMulheres = 0;
        int quantiHomens = 0;

        for (int i = 0; i < pessoas.length; i++) {

            if (menorAutura > pessoas[i].getAltura()) {
                menorAutura = pessoas[i].getAltura();
            }

            if (maiorAltura < pessoas[i].getAltura()) {
                maiorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getGenero() == 'F') {
                acumuladroAlturaMulheres += pessoas[i].getAltura();
                quantidadeMulheres++;
            } else {
                quantiHomens++;
            }
        }

        System.out.println("Menor altura = " + menorAutura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (acumuladroAlturaMulheres/quantidadeMulheres));
        System.out.println("Numero de homens = " + quantiHomens);
    }




}
