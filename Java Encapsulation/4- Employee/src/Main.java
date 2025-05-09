/*
4. Write a Java program to create a class called Employee with private instance variables employee_id,
employee_name, and employee_salary. Provide public getter and setter methods to access and modify the
id and name variables, but provide a getter method for the salary variable that returns a formatted string.
*/


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(2123);
        emp.setEmployeeName("John Smith");
        emp.setSalary(1250000.26182);

        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getSalary());


    }
}