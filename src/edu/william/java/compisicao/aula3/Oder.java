package edu.william.java.compisicao.aula3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Oder {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    List<OrderItem> orderItens = new ArrayList<>();
    private Client client;


    public Oder() {
    }

    public Oder(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItens.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItens.remove(item);
    }

    private double total() {
        double valorTotal = 0;
        for (OrderItem item:orderItens) {
            valorTotal += item.subtotal();
        }
        return valorTotal;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: " + sdf2.format(this.moment) + "\n");
        sb.append("Order status: " + this.status + "\n");
        sb.append("Client: " + this.client.getName() + " ("+sdf.format(this.client.getBirthDate())+")" + " - " +this.client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem item:orderItens) {
            sb.append(item.getProduct().getName() + ", $" + String.format("%.2f", item.getProduct().getPrice()) + ", Quantity: " + item.getQuantity() + ", "
            + "Subtotal: " + String.format("%.2f", item.subtotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }


}
