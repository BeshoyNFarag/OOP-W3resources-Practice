/*
2. Write a Java program to create a class Vehicle with a method called speedUp().
Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.
*/

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.speedUp();
        bike.speedUp();
    }
}