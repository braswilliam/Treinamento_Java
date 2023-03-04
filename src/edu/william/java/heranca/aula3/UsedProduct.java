package edu.william.java.heranca.aula3;


import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacture;




    public  UsedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }


    public Date getManufacture() {
        return manufacture;
    }

    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String pricetag() {
        return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + sdf.format(getManufacture())+")";
    }
}
