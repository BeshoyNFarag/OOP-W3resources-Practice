/*
5. Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable. However,
provide two methods called calculateArea() and calculatePerimeter() that return the calculated
area and perimeter based on the current radius value
*/



public class Circle {
    private int radius;


    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void calculateArea(){

        double area = Math.PI  * Math.pow(getRadius(), 2);
        System.out.printf("Area is: %.2f%n" , area);

    }
    public void calculatePerimeter(){

        double Peri = Math.PI  * 2 *getRadius();
        System.out.printf("Perimeter is: %.2f%n ", Peri);

    }


}
