package com.mycompany.pawsshop.data;

/**
 *
 * @author mihin
 */
public class Item {
    private String supplierName;
    private String category;
    private double price;
    private double payment;
    private int totalItems;

    // Constructor
    public Item(String supplierName, String category, double price, double payment, int totalItems) {
        this.supplierName = supplierName;
        this.category = category;
        this.price = price;
        this.payment = payment;
        this.totalItems = totalItems;
    }

    // Getters and Setters
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
}
