/*
5. Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable. However,
provide two methods called calculateArea() and calculatePerimeter() that return the calculated
area and perimeter based on the current radius value
*/


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.getRadius());
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}