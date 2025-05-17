/*
4. Static Final Variables
Write a Java program to create a class called Constants with a static final variable
'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius,
using the 'PI' constant. Demonstrate the method in the main method.
*/

public class Main {
    public void calculateCircleArea(double radius){
        System.out.println("Area of this Circle: " + (Constants.PI) * Math.pow(radius, 2));

    }


    public static void main(String[] args) {

        Main m = new Main();

        m.calculateCircleArea(5);
    }
}