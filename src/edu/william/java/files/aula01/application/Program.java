package edu.william.java.files.aula01.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("D:\\Estudos\\Treinamento_Java\\src\\edu\\william\\java\\files\\aula01\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}
