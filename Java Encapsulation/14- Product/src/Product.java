/*
Write a Java program to create a class called Product with private instance variables productName,
productCode, and price. Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
*/


public class Product {
    private String name;
    private double price;
    private int code;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void applyDiscount(double discount){
        discount = discount / 100;
        price = price - (discount * price);

    }
}
