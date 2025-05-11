/*
Write a Java program to create a class called Product with private instance variables productName,
productCode, and price. Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
*/


public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(100);
        product.setCode(223445);
        product.setName("Light bulb");

        System.out.println(product.getPrice());
        product.applyDiscount(10);
        System.out.println(product.getPrice());
    }
}