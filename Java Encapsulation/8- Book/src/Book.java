/*
8. Write a Java program to create a class called “Book” with private instance variables title,
author, and price. Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by
that percentage.
*/



public class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public void addDiscount(double discount){
        discount = discount / 100;
        price = price -  (price * discount);
    }

}
