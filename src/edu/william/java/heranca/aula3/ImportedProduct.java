package edu.william.java.heranca.aula3;

public class ImportedProduct extends Product{

    private Double customFree;

    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customFree = customFree;
    }

    public Double getCustomFree() {
        return customFree;
    }

    public void setCustomFree(Double customFree) {
        this.customFree = customFree;
    }


    public double totalPrice() {
        return super.getPrice() + getCustomFree();
    }

    @Override
    public String pricetag() {
        return getName() + " $ " +totalPrice() + " (Customs fee: $ " + getCustomFree() +")";
    }
}
