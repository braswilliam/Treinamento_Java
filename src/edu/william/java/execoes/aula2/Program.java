package edu.william.java.execoes.aula2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        methond2();
        System.out.println("Fim do programa.");


    }

    public static void methond2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***METHOD2 START***");
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position.");
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error!");
        }

        sc.close();

    }

}
