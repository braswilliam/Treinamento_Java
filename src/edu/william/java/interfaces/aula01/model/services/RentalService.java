package edu.william.java.interfaces.aula01.model.services;

import edu.william.java.interfaces.aula01.model.entities.CarRental;
import edu.william.java.interfaces.aula01.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;


    public RentalService(Double pricePerHour, Double pricePerDay, TaxService tazService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = tazService;
    }


    public void processInvoice(CarRental carRental) {
       double minutes =  Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
       double hours = minutes / 60;
       double basicPayment;
       if (hours <= 12.0) {
           basicPayment = pricePerHour * Math.ceil(hours);
       } else {
          basicPayment = pricePerDay * Math.ceil(hours / 24.0);
       }

       double tax = taxService.tax(basicPayment);

       carRental.setInvoice(new Invoice(basicPayment, tax));
    }


}
