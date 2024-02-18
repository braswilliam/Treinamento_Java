package edu.william.java.files.aula05.application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //usei o caminho das minhas pastas: D:\Estudos\Treinamento_Java\src\edu\william\java


    }

}

