/*
6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/



public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea(){
        System.out.println( this.getClass().getName() + " Area: " + (Math.PI * Math.pow(radius, 2)));
    }

    public void getPerimeter(){
        System.out.println( this.getClass().getName() + " Perimeter: " + (Math.PI * radius * 2));
    }

}
