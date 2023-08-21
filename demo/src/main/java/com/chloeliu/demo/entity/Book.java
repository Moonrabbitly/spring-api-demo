package com.chloeliu.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "book")
public class Book extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="product_name")
    private String pname;
    @Column(name="barcode")
    private String barcode;
    @Column(name="price")
    private double price;
    @Column(name="inventory_count")
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
