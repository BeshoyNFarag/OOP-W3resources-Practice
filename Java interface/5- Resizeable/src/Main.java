/*
5. Write a Java program to create an interface Resizable with methods resizeWidth(int width)
and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that
implements the Resizable interface and implements the resize methods.
*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.resizeHeight(7);
        rectangle.resizeWidth(8);
        rectangle.getNewAspects();
    }
}