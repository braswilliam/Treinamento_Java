package edu.william.java.excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        File file = new File("D:\\Estudos\\Treinamento_Java\\src\\edu\\william\\java\\excecoes\\ArquivoComum.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }

            System.out.println("Finaly block executed");
        }
    }
}
