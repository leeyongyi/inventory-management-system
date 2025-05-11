package com.mycompany.inventorymanagementsystem;

// Abstraction & Interface: Supplier class extends Person class and implements the PersonDetail interface
public class Supplier extends Person implements PersonDetail{
    // Encapsulation
    private String supplierID;
    // Constructor
    public Supplier(String name, String email, String supplierID){
        super(name, email); // Using super to call parent class constructor
        this.supplierID = supplierID;
    }
    // Getter
    public String getSupplierID() {
        return supplierID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    // Setter
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // Display supplier details
    public void displayDetails() {// Polymorphism: Overriding method (runtime polymorphism)
        System.out.println("Supplier ID: " + supplierID);
        System.out.println("Supplier Name: " + name);
        System.out.println("Supplier Email: " + email);
    }
}
