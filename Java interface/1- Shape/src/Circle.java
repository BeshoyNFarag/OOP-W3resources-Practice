/*
1. Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.
*/


public class Circle implements Shape {
    private double radius;

    private double circleArea;
    public Circle(double radius){
        this.radius = radius;
        circleArea = Math.PI * Math.pow(radius, 2);

    }

    public void getArea(){
        System.out.println("The Area of the " + this.getClass().getSimpleName() + " shape is: " + circleArea);
    }
}
