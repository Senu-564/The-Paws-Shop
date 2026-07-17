package com.mycompany.pawsshop.data;

/**
 *
 * @author mihin
 */
public abstract class User {
    private int userId;
    private String username;
    private String password;
    private String role;

    // Constructor for initializing User
    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    // Abstract method for display
    public abstract void displayRole();
}

