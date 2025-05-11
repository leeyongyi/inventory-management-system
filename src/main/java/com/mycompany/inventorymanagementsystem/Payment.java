package com.mycompany.inventorymanagementsystem;

public class Payment {
    // Encapsulation
    private String date;
    private double amountPayment;
    private String paymentMethod;    
    // Constructor
    public Payment (String date, double amountPayment, String paymentMethod){
    this.date = date;
    this.amountPayment = amountPayment;
    this.paymentMethod = paymentMethod;
    }
    // Getter
    public String getDate(){
        return date;
    }
    public double getAmountPayment(){
        return amountPayment;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    // Setter
    public void setDate(String date){
        this.date = date;
    }
    public void setAmountPayment(double amountPayment){
        this.amountPayment = amountPayment;
    }
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    
    // Display payment details
    public void displayDetails(){// Polymorphism: Overriding method (runtime polymorphism)
        System.out.println("Payment Date: " + date);
        System.out.println("Amount of Payment: RM" + amountPayment);
        System.out.println("Payment Method: " + paymentMethod);
    }
}