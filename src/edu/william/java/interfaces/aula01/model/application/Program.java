package edu.william.java.interfaces.aula01.model.application;

import edu.william.java.interfaces.aula01.model.entities.CarRental;
import edu.william.java.interfaces.aula01.model.entities.Vehicle;
import edu.william.java.interfaces.aula01.model.services.BrasilTaxService;
import edu.william.java.interfaces.aula01.model.services.RentalService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.printf("Pagamento basico: %.2f%n",  cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f%n",  cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment());


        sc.close();

    }

}
