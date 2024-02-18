package edu.william.java.interfaces.aula01.model.entities;

public class Vehicle {

    private String model;

    public Vehicle() {}

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public static class Invoice {


        private Double basicPayment;
        private Double tax;




        public Invoice(){};

        public Invoice(Double basicPayment, Double tax) {
            this.basicPayment = basicPayment;
            this.tax = tax;
        }


        public Double getBasicPayment() {
            return basicPayment;
        }

        public void setBasicPayment(Double basicPayment) {
            this.basicPayment = basicPayment;
        }

        public Double getTax() {
            return tax;
        }

        public void setTax(Double tax) {
            this.tax = tax;
        }

        public Double getTotalPayment() {
            return getBasicPayment() + getTax();
        }

    }
}
