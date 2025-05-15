/*
12. Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw
the respective shape. In addition, override the calculateArea() method in the Cylinder subclass
to calculate and return the total surface area of the cylinder.
*/



public class Cylinder extends Shape {
    private double height;
    private double radius;

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public void draw(){
        System.out.println("drawing a cylinder");
    }

    public void calculateArea(){
        System.out.println("Cylinder's Area: " +  2 * Math.PI * radius * height);
    }


}
