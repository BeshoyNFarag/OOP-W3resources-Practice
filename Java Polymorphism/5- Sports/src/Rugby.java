/*
5. Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass
to play a specific statement for each sport.
*/


public class Rugby extends Sports {



    @Override
    public void play(){
        System.out.println("Playing " + this.getClass().getSimpleName() + "....");
    }
}
