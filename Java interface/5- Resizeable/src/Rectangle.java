/*
5. Write a Java program to create an interface Resizable with methods resizeWidth(int width)
and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that
implements the Resizable interface and implements the resize methods.
*/


import java.awt.*;

public class Rectangle implements Resizeable{

    private int height;
    private int width;

    public Rectangle (int width, int height){

        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeHeight(int newHeight) {
        this.height = newHeight;

    }


    @Override
    public void resizeWidth(int newWidth) {
        this.width = newWidth;

    }

    public void getNewAspects(){
        System.out.printf("Height is %d width is %d%n", height, width);
    }
}
