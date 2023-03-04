package edu.william.java.heranca.aula2;

public class OutsourcedEmployees extends Employee{

    private double additionalCharge;


    public OutsourcedEmployees() {
        super();
    }

    public OutsourcedEmployees(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final double payment() {
        return super.payment() + additionalCharge * 1.1;
    }



}
