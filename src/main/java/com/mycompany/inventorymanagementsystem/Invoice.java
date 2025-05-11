package com.mycompany.inventorymanagementsystem;

// Inheritance: Invoice class extends Order class
public class Invoice extends Order{
    // Encapsulation
    private int invoiceID;
    private String invoiceDate;
    private Payment payment; // Composition: Invoice has a Payment
    private Supplier supplier; // Aggregation: Invoice has a Supplier
    private static Invoice[] invoiceList = new Invoice[10]; // Array
    private static int invoiceCount = 0;    
    // Constructor
    public Invoice(String product, int quantity, Supplier supplier, double price, String deliveryDate, String status,
                   String invoiceDate, Payment payment) {
        super(product, quantity, supplier, price, deliveryDate, status);
        this.invoiceID = ++invoiceCount;
        this.payment = payment;
        this.supplier = supplier;
    }
    // Getter
    public String getInvoiceDate() {
        return invoiceDate;
    }
    public int getInvoiceID() {
        return invoiceID;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public Payment getPayment() {
        return payment;
    }
    public static Invoice[] getInvoiceList() {
        return invoiceList;
    }
    public static int getInvoiceCount() {
        return invoiceCount;
    }
    // Setter
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public void setInvoiceList(Invoice[] invoiceList) {
        Invoice.invoiceList = invoiceList;
    }
    public void setInvoiceCount(int invoiceCount) {
        Invoice.invoiceCount = invoiceCount;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    // Display detailed invoice information
    public void displayDetails() {// Polymorphism: Overriding method (runtime polymorphism)
        System.out.println("\nInvoice Detail");
        System.out.println("Invoice ID: " + getInvoiceID());
        supplier.displayDetails(); // Polymorphism: calling overridden method
        payment.displayDetails();
    }
}