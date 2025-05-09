/*
4. Write a Java program to create a class called Employee with private instance variables employee_id,
employee_name, and employee_salary. Provide public getter and setter methods to access and modify the
id and name variables, but provide a getter method for the salary variable that returns a formatted string.
*/

import java.text.NumberFormat;
import java.util.Locale;


public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSalary(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        return nf.format(salary);


    }



}
