/*
1. Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.
*/


public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getArea(){
        System.out.println("The Area of the " + this.getClass().getSimpleName() + " shape is: " + length * width);
    }
}
