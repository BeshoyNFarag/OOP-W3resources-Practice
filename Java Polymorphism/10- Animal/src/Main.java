/*
10. Write a Java program to create a base class Animal with methods eat() and sound().
Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass
to describe what each animal eats. In addition, override the sound() method to make a specific
sound for each animal.
*/


public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();
        lion.eat();
        lion.makeSound();
        tiger.eat();
        tiger.makeSound();
        panther.eat();
        panther.makeSound();

    }
}