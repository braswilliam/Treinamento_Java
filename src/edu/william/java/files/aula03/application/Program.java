package edu.william.java.files.aula03.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        //Uma string que recebe o caminho do arquivo:
        String path = "D:\\Estudos\\Treinamento_Java\\src\\edu\\william\\java\\files\\aula02\\in.txt";

        try (BufferedReader br = new BufferedReader( new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
