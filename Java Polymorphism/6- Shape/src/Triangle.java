/*
6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/




public class Triangle extends Shape {

    private double height;
    private double base;
    private double side;
    public Triangle(double height, double base, double side) {
        this.height = height;
        this.base = base;
        this.side = side;
    }



    public void getArea(){
        System.out.println( this.getClass().getName() + " Area: " + (height * base * 0.5));
    }

    public void getPerimeter(){
        System.out.println( this.getClass().getName() + " Perimeter: " + (height * base + side));
    }
}
