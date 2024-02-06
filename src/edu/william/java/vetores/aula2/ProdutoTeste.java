package edu.william.java.vetores.aula2;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEntre com a quantidade de produtos:");
        int quantidade = input.nextInt();


        Produto [] p = new Produto[quantidade];
        
        
        double soma = 0.0;
        int contador = 1;

        for (Produto produto : p) {
            input.nextLine();
            System.out.printf("\nInforme o nome do produto %d: ", contador);
            String nome = input.nextLine();
            System.out.print("Informe o preço do produto: ");
            double preco = input.nextDouble();

            produto = new Produto(nome, preco);
            
            soma += produto.getPreco();
            contador++;
        }

        System.out.println();

        System.out.print("A media de preço dos produtos é de: ");
        System.out.println(soma / p.length);

        
        input.close();

    }
}
