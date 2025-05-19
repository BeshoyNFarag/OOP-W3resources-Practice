/*
Write a Java program to create an outer class called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints the department name and the
number of faculty members. Instantiate the Department class from the main method and call
the "displayInfo()" method.
*/



public class Main {
    public static void main(String[] args) {
        University.Department engineering = new University.Department("Engineering" , 20);
        University.Department business = new University.Department("Business" , 30);
        University.Department tech = new University.Department("Tech" , 40);

        engineering.displayInfo();
        business.displayInfo();
        tech.displayInfo();


    }
}