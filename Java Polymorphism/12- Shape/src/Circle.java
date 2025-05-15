/*
12. Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw
the respective shape. In addition, override the calculateArea() method in the Cylinder subclass
to calculate and return the total surface area of the cylinder.
*/


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("drawing a circle");
    }


    public void calculateArea(){
        System.out.println("Circle's Area: " + Math.pow(radius, 2) * Math.PI);
    }
}
