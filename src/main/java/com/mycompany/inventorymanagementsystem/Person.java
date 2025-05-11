package com.mycompany.inventorymanagementsystem;

// Abstract class
abstract public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    // Abstract method
    abstract public void displayDetails();
}
