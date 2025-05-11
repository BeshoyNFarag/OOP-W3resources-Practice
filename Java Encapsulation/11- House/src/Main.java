/*
11. Write a Java program to create a class called House with private instance variables address,
numberOfRooms, and area. Provide public getter and setter methods to access and modify these variables.
Add a method called calculatePrice() that returns the price of the house based on its area and
a price per square meter.
*/


public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("100 charming avenue, new york");
        house.setArea(100);
        house.setNumberOfRooms(3);
        System.out.println(house.getAddress());
        System.out.println(house.getArea());
        System.out.println(house.getNumberOfRooms());
        house.calculatePrice();
    }
}