/*
3. Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
method in each subclass to calculate and return the shape's area.
*/

public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
