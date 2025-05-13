/*
4. Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
method to calculate and return the salary based on their specific roles.
*/

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager(2500);
        Employee programmer = new Programmer(2250);
        manager.calculateSalary();
        programmer.calculateSalary();

    }
}