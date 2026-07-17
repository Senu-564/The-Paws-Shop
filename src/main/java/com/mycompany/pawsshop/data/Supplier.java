package com.mycompany.pawsshop.data;
/**
 *
 * @author mihin
 */
public class Supplier{
    private int supplierId;
    private String name;
    private String email;
    private String contact;

    // Constructor
    public Supplier(int supplierId, String name, String email, String contact) {
        this.supplierId = supplierId;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    // Getter and Setter methods
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}