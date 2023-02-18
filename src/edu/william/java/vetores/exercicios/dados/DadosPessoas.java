package edu.william.java.vetores.exercicios.dados;

public class DadosPessoas {
    private Double altura;
    private Character genero;


    public DadosPessoas(Double altura, Character genero) {
        this.altura = altura;
        this.genero = genero;
    }


    public Double getAltura() {
        return altura;
    }

    public Character getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "DadosPessoas{" +
                "altura=" + altura +
                ", genero=" + genero +
                '}';
    }
}
