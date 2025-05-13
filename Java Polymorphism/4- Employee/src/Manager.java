/*
4. Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary()
method to calculate and return the salary based on their specific roles.
*/


public class Manager extends Employee {
    private double salary;
    private String role;

    public Manager(double salary) {
        this.salary = salary;
        this.role = this.getClass().getSimpleName();
    }

    public void calculateSalary() {
        System.out.println(salary);
    }

}
