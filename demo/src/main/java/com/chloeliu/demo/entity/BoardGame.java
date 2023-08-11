package com.chloeliu.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "boardgame")
public class BoardGame implements Product {
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
    @Column(name="description")
    private String description;
    //private boolean onSale;
    public BoardGame() {}
    public BoardGame(String pname, String barcode, double price, int noofproduct, String description) {
        //this.id = id;
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
    public String toString() {
        return "BoardGame{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", barcode='" + barcode + '\'' +
                ", price=" + price +
                ", noofproduct=" + noofproduct +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public String getDiscountInfo() {
        return "Buy one get one 25% off!";
    }
}
