package com.mycompany.inventorymanagementsystem;

public class Admin extends Person implements PersonDetail{
    // Constructor
    public Admin(String name, String email){
        super(name, email);
    }
    // Getter
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Display admin details
    public void displayDetails() {// Polymorphism: Overriding method (runtime polymorphism)
        System.out.println("Admin Name: " + name);
        System.out.println("Admin Email: " + email);
    }
}