package edu.william.java.files.Aula6;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }
        //usei o caminho das minhas pastas: D:\Estudos\Treinamento_Java\src\edu\william\java\files\Aula6


    }

}

