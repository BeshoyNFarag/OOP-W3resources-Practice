/*
9. Write a Java program to create a class called Smartphone with private instance variables brand,
model, and storageCapacity. Provide public getter and setter methods to access and modify these
variables. Add a method called increaseStorage() that takes an integer value and increases the
storageCapacity by that value.
*/


public class Smartphone {

    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void increaseStorageCapacity(int increase) {
        storageCapacity += increase;
    }
}
