/*
11. Write a Java program to create a class called House with private instance variables address,
numberOfRooms, and area. Provide public getter and setter methods to access and modify these variables.
Add a method called calculatePrice() that returns the price of the house based on its area and
a price per square meter.
*/


public class House {
    private String address;
    private int numberOfRooms;
    private double area;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calculatePrice(){

        System.out.println("Price per Square meter: " + 250);
        System.out.println("Price for the house: " + area * 250);

    }
}
