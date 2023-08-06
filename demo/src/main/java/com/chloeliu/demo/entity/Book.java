package com.chloeliu.demo.entity;

public class Book implements Product{
    private int id;
    private String pname;
    private String barcode;
    private double price;
    private int noofproduct;
    //private boolean onSale;
    public Book() {}
    public Book(int id, String pname, String barcode, double price, int noofproduct) {
        this.id = id;
        this.pname = pname;
        this.barcode = barcode;
        this.price = price;
        this.noofproduct = noofproduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoofproduct() {
        return noofproduct;
    }

    public void setNoofproduct(int noofproduct) {
        this.noofproduct = noofproduct;
    }

    @Override
    public String getDiscountInfo() {
        return "All children's books are 20% OFF!";
    }
}
