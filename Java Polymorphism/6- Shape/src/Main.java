/*
6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3,4,5);
        circle.getArea();
        circle.getPerimeter();
        rectangle.getArea();
        rectangle.getPerimeter();
        triangle.getArea();
        triangle.getPerimeter();

    }
}