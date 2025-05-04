/*
3. Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.
*/

public class Main {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airline = new Airline();
        Flyable helicopter = new Helicopter();


        spacecraft.fly_obj();
        airline.fly_obj();
        helicopter.fly_obj();


    }
}