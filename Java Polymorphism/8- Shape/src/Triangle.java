/*
8. Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass
to draw the respective shape, and override the calculateArea() method to calculate and return
the area of each shape.
*/


public class Triangle extends Shape {

    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("drawing: " + this.getClass().getName());
    }

    @Override
    public void calculateArea(){
        System.out.println(this.getClass().getName() + " has area: " + (base * height * 0.5));
    }
}
