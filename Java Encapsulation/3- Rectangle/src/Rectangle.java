/*
3. Write a Java program to create a class called Rectangle with private instance
variables length and width. Provide public getter and setter methods to access and
modify these variables.
*/


public class Rectangle {

    private int length;
    private int width;


    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}
