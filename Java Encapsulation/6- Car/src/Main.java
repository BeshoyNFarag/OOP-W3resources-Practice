/*
6. Write a Java program to create a class called Car with private instance variables company_name,
model_name, year, and mileage. Provide public getter and setter methods to access and modify the
company_name, model_name, and year variables. However, only provide a getter method for
the mileage variable.
*/


public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2025);
        car.setCompanyName("Toyota");
        car.setModelName("Latest");


        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
    }
}