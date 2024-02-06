package edu.william.java.vetores.exercicios.hotel;

public class Aluguel {

    private String nome;
    private String email;
    private Integer quarto;


    public Aluguel(String nome, String email, Integer quarto) {
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getQuarto() {
        return quarto;
    }


    @Override
    public String toString() {
        return "Locatário{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", quarto=" + quarto +
                '}';
    }



}
