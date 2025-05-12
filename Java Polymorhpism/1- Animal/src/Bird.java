/*
1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific
sound for each animal.
*/

public class Bird extends Animal {

    @Override
    public void sound(){

        System.out.println(this.getClass().getName() + " SewSewSew");
    }
}
