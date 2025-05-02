/*
1. Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.
*/


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,4);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3,4);

        rectangle.getArea();
        circle.getArea();
        triangle.getArea();
    }
}