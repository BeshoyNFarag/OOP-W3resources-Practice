/*
11. Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each
subclass to start and stop the engines differently.
*/

public class Car extends Vehicle {

    public void startEngine(){
        System.out.println("Car Engine started with a key");
    }

    public void stopEngine(){
        System.out.println("Car Engine stopped with a key");
    }
}
