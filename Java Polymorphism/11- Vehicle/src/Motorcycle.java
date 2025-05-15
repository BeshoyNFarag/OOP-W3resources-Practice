/*
11. Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each
subclass to start and stop the engines differently.
*/

public class Motorcycle extends Vehicle {

    public void startEngine(){
        System.out.println("Motorbike Engine started with an electronic key");
    }

    public void stopEngine(){
        System.out.println("Motorbike Engine closed with an electronic key");
    }
}