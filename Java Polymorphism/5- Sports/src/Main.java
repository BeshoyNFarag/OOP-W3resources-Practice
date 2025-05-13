/*
5. Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass
to play a specific statement for each sport.
*/

public class Main {
    public static void main(String[] args) {

        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();

    }
}