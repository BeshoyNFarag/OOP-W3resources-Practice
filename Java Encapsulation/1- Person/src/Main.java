/*
1. Write a Java program to create a class called Person with private instance variables name,
age. and country. Provide public getter and setter methods to access and modify these variables.
*/


public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(22);
        person.setName("John");
        person.setCountry("USA");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getCountry());

    }
}