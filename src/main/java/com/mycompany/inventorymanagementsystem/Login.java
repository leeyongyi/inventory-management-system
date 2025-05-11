package com.mycompany.inventorymanagementsystem;

import java.util.Scanner;

public class Login {
    // Encapsulation
    private String email;
    private String password;
    // Constructor
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    // Getter
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    // Verify Login
    public boolean verifyLogin(String inputEmail, String inputPassword) {
        return email.equals(inputEmail) && password.equals(inputPassword);
    }

    public static Login[] initializeAdminLogins() {
        Login[] adminLogins = {
            new Login("ainul@gmail.com", "admin123"),
            new Login("lee@gmail.com", "admin123"),
            new Login("aida@gmail.com", "admin123"),
            new Login("im@gmail.com", "admin123")
        };
        return adminLogins;
    }
}