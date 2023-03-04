package edu.william.java.heranca.aula6;

public class Company extends TaxPayer{

    private Integer numeroOfEmployees;

    public Company(String name, Double anualincome, Integer numeroOfEmployees) {
        super(name, anualincome);
        this.numeroOfEmployees = numeroOfEmployees;
    }


    public Integer getNumeroOfEmployees() {
        return numeroOfEmployees;
    }

    public void setNumeroOfEmployees(Integer numeroOfEmployees) {
        this.numeroOfEmployees = numeroOfEmployees;
    }


    @Override
    public double tax() {
        double tax = 0.0;
        if (this.numeroOfEmployees > 10) {
            tax = super.getAnualincome() * 0.14;
        } else {
            tax = super.getAnualincome() * 0.16;
        }

        return tax;
    }
}
