package edu.william.java.vetores.exercicios.aprovados;


import java.util.Locale;
import java.util.Scanner;

public class AlunosTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int qAlunos = input.nextInt();

        input.nextLine();

        Aluno[] alunos = new Aluno[qAlunos];

        for (int i = 0; i < alunos.length ; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + " o aluno:");

            String nome = input.nextLine();

            double n1 = input.nextDouble();

            double n2 = input.nextDouble();

            alunos[i] = new Aluno(nome, n1, n2);

            input.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length ; i++) {

            if (((alunos[i].getNota1() + alunos[i]. getNota2()) / 2) >= 6.0 ) {
                System.out.println(alunos[i].getNome());
            }

        }




        input.close();


    }
}
