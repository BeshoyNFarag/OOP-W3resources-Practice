/*
3. Write a Java program to create a base class Shape with a method called calculateArea().
Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
method in each subclass to calculate and return the shape's area.
*/


public class Triangle extends Shape {
    private double length;
    private double width;

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * length * width);
    }

}
