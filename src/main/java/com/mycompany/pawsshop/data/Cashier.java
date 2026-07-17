package com.mycompany.pawsshop.data;

/**
 *
 * @author mihin
 */
public class Cashier extends User {

    // Constructor for Cashier
    public Cashier(int userId, String username, String password) {
        super(userId, username, password, "Cashier");
    }

    @Override
    public void displayRole() {
        System.out.println("Role: " + this.getRole());
    }
}

