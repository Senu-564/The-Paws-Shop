package com.mycompany.pawsshop.data;

/**
 *
 * @author mihin
 */
public class Manager extends User {

    // Constructor for Manager
    public Manager(int userId, String username, String password) {
        super(userId, username, password, "Manager");
    }

    @Override
    public void displayRole() {
        System.out.println("Role: " + this.getRole());
    }
}

