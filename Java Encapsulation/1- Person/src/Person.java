/*
1. Write a Java program to create a class called Person with private instance variables name,
age. and country. Provide public getter and setter methods to access and modify these variables.
*/




public class Person {
    private String name;
    private int age;
    private String country;


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCountry(String country){
        this.country = country;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }

}
