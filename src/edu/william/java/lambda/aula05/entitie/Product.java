package edu.william.java.lambda.aula05.entitie;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
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
    public static String staticUppercase(Product p) {
        return p.getName().toUpperCase();
    }

    //Método não estático:
    public String nonStaticToUppercase() {
      return  name.toUpperCase();
    }


    @Override
    public String toString() {
        return "Name:" + name + ", Price: " + String.format("%.2f", price);
    }

}
