/*
8. Write a Java program to create an interface Playable with a method play()
that takes no arguments and returns void. Create three classes Football, Volleyball,
and Basketball that implement the Playable interface and override the play() method
to play the respective sports.
*/


public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable basketball = new Basketball();
        Playable volleyball = new Volleyball();


        football.play();
        basketball.play();
        volleyball.play();

    }
}