/*
3. Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
method in each subclass to calculate and return the shape's area.
*/

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 6);
        Shape triangle = new Triangle(5, 6);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();


    }
}