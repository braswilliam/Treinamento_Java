package edu.william.java.generics.desafio.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Votos {

    //Criei uma lista do tipo Map que passa o nome do candidato a seus votos descritos como lista:
    private final Map<String, List<Integer>> votosPorCandidato;

    //construtor
    public Votos() {
        votosPorCandidato = new HashMap<>();
    }

    //método para ler arquivos:
    public void lerArquivo(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); //divide o array por ","
                String name = fields[0].trim(); //o trim permite limpar os espaços vazios;
                int votos = Integer.parseInt(fields[1].trim());

                // Verificar se o candidato já existe no mapa
                if (!votosPorCandidato.containsKey(name)) {
                    votosPorCandidato.put(name, new ArrayList<>());
                }
                // Adicionar os votos do candidato
                votosPorCandidato.get(name).add(votos);

                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de leitura: " + e.getMessage());
        }
    }

    public void imprimirVotosPorCandidato() {
        // Imprimir os votos por candidato
        for (Map.Entry<String, List<Integer>> entry : votosPorCandidato.entrySet()) {
            String nomeCandidato = entry.getKey();
            List<Integer> votos = entry.getValue();

            System.out.println(nomeCandidato + ": " + votos);
        }
    }


}
