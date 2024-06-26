package edu.william.java.lambda.aula04.entitie;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    //Método estático:
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    //Método não estático:
    public void nonStaticPriceUpdate() {
      setPrice(getPrice() * 1.1);
    }


    @Override
    public String toString() {
        return "Name:" + name + ", Price: " + String.format("%.2f", price);
    }

}
