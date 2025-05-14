/*
8. Write a Java program to create a base class Shape with methods draw() and calculateArea().
Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass
to draw the respective shape, and override the calculateArea() method to calculate and return
the area of each shape.
*/



public class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw(){
        System.out.println("drawing: " + this.getClass().getName());
    }


    @Override
    public void calculateArea(){
        System.out.println(this.getClass().getName() + " has area: " + Math.pow(radius,2) * Math.PI);
    }


}
