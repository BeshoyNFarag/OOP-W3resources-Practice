/*
8. Write a Java program to create a class called “Book” with private instance variables title,
author, and price. Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by
that percentage.
*/


public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Martin");
        book.setTitle("A Random Walk Down Wall Street");
        book.setPrice(100);
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        book.addDiscount(10.0);
        System.out.println(book.getPrice());

    }
}