/*
9. Write a Java program to create a class called Smartphone with private instance variables brand,
model, and storageCapacity. Provide public getter and setter methods to access and modify these
variables. Add a method called increaseStorage() that takes an integer value and increases the
storageCapacity by that value.
*/

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("Iphone");
        smartphone.setStorageCapacity(125);
        System.out.println(smartphone.getBrand());
        System.out.println(smartphone.getModel());
        System.out.println(smartphone.getStorageCapacity());
        smartphone.increaseStorageCapacity(125);
        System.out.println(smartphone.getStorageCapacity());

    }
}