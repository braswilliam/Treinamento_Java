package edu.william.java.files.aula08.application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        System.out.println("getName: " + path.getName()); //pega o nome do arquivo;
        System.out.println("getParent: " + path.getParent()); //caminho até a pasta mãe
        System.out.println("getPath: " + path.getPath()); //pega tudo

        //utilizei o caminho deste arquivo:
        // D:\Estudos\Treinamento_Java\src\edu\william\java\files\aula07\application\Program.java





        sc.close();


    }

}
