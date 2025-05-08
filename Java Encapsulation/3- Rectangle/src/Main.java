/*
3. Write a Java program to create a class called Rectangle with private instance
variables length and width. Provide public getter and setter methods to access and
modify these variables.

*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());


    }
}