package edu.william.java.vetores.aula3;

public class BoxingUboxing  {

    public static void main(String[] args) {

        int x = 20;

        Object obj = x; //boxing

        System.out.println(obj); //imprime normal.

        int y = (int) obj; //unboxing


        System.out.println(y);



    }


}
