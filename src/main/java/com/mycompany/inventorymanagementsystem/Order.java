package com.mycompany.inventorymanagementsystem;

public class Order {
    protected int orderId;
    protected String product;
    protected int quantity;
    protected Supplier supplier; // Aggregation: Order has a Supplier
    protected double price;
    protected String deliveryDate;
    protected String status;
    protected static Order[] orderList = new Order[10]; // Array
    protected static int orderCount = 0;
    // Constructor
    public Order(String product, int quantity, Supplier supplier, double price, String deliveryDate, String status) {
        this.orderId = ++orderCount;
        this.product = product;
        this.quantity = quantity;
        this.supplier = supplier;
        this.price = price;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }
    // Getter
    public int getOrderId() {
        return orderId;
    }
    public String getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public double getPrice() {
        return price;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public String getStatus() {
        return status;
    }
    public static Order[] getOrderList() {
        return orderList;
    }
    public static int getOrderCount() {
        return orderCount;
    }
    // Setter
    public void setProduct(String product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public static void setOrderCount(int orderCount) {
        Order.orderCount = orderCount;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public static void setOrderList(Order[] orderList) {
        Order.orderList = orderList;
    }
    
    public void displayDetails() {// Polymorphism: Overriding method (runtime polymorphism)
        System.out.println("\nOrder Detail");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Product: " + getProduct());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Supplier: " + getSupplier().getName());
        System.out.println("Price: RM" + getPrice());
        System.out.println("Delivery Date: " + getDeliveryDate());
        System.out.println("Status: " + getStatus());
    }
}
