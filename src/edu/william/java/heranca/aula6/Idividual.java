package edu.william.java.heranca.aula6;

public class Idividual extends TaxPayer {

    private Double healthExoenditures;

    public Idividual(String name, Double anualincome, Double healthExoenditures) {
        super(name, anualincome);
        this.healthExoenditures = healthExoenditures;
    }



    @Override
    public double tax() {
        double tax = 0.0;
        if (super.getAnualincome() < 20000.0) {
           tax =  super.getAnualincome() * 0.15;
        } else if (super.getAnualincome() > 20000.0){
            tax =  (super.getAnualincome() * 0.25) - (this.healthExoenditures * 0.50);
        }
        return tax;
    }
}
