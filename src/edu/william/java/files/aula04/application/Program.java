package edu.william.java.files.aula04.application;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String [] lines = new String[] {"Good Mornig", "Good Afternoon", "Good night"};

        String path = "D:\\Estudos\\Treinamento_Java\\src\\edu\\william\\java\\files\\aula04\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
