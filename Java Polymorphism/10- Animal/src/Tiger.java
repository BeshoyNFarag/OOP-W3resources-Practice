/*
10. Write a Java program to create a base class Animal with methods eat() and sound().
Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass
to describe what each animal eats. In addition, override the sound() method to make a specific
sound for each animal.
*/

public class Tiger extends Animal {

    public void eat(){
        System.out.println(this.getClass().getName() + " eats Deer and fights Lion");
    }

    public void makeSound(){
        System.out.println(this.getClass().getName() + " : Lowder Roar!");
    }
}
