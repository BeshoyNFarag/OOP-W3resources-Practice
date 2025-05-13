/*
6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/



public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }




    public void getArea(){
        System.out.println( this.getClass().getName() + " Area: " + (height * width));
    }

    public void getPerimeter(){
        System.out.println( this.getClass().getName() + " Perimeter: " + (2 * (height + width)));
    }
}
