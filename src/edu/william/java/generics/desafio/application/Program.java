package edu.william.java.generics.desafio.application;

import edu.william.java.generics.desafio.entities.Votos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Caminho do arquivo : /home/will/Documentos/in.txt
        System.out.println("Informe o caminho do arquivo: ");
        String path = sc.nextLine();

        Votos votos = new Votos();
        votos.lerArquivo(path);
        votos.imprimirVotosPorCandidato();

        sc.close();

    }
}
