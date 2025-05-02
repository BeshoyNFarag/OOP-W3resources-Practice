/*
1. Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.
*/


public class Triangle implements Shape {


    private double base;
    private double height;
    private double area;




    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = this.base * this.height * 0.5;

    }

    public void getArea(){
        System.out.println("The Area of the " + this.getClass().getSimpleName() + " shape is: " + area);
    }
}
