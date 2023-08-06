package com.chloeliu.demo.entity;

public class BoardGame implements Product {
    private int id;
    private String pname;
    private String barcode;
    private double price;
    private int noofproduct;
    private String description;
    //private boolean onSale;
    public BoardGame() {}
    public BoardGame(int id, String pname, String barcode, double price, int noofproduct, String description) {
        this.id = id;
        this.pname = pname;
        this.barcode = barcode;
        this.price = price;
        this.noofproduct = noofproduct;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDiscountInfo() {
        return null;
    }
}
