/*
10. Write a Java program to create a class called Desktop with private instance variables brand,
processor, and ramSize. Provide public getter and setter methods to access and modify
these variables. Add a method called upgradeRam() that takes an integer value and increases
the ramSize by that value.
*/



public class Main {
    public static void main(String[] args) {
        Desktop desk = new Desktop();
        desk.setBrand("Microsoft");
        desk.setProcessor("i5");
        desk.setRamSize(8);
        System.out.println(desk.getBrand());
        System.out.println(desk.getProcessor());
        System.out.println(desk.getRamSize());
        desk.upgradeRam(4);
        System.out.println(desk.getRamSize());
    }
}