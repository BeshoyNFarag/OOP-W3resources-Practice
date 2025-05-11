/*
13. Write a Java program to create a class called Movie with private instance variables title, director,
and duration. Provide public getter and setter methods to access and modify these variables.
Add a method called getMovieDetails() that returns a formatted string containing the movie details.
*/


import java.time.Duration;

public class Movie {
    private String title;
    private String director;
    private Duration duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        String[] parts = duration.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        this.duration = Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);
    }

    public void getDetails(){
        System.out.printf("Movie Title: %s%nMovie Director: %s%n", this.getTitle(), this.getDirector());
        System.out.println("Movie Duration: " + this.getDuration().toMinutes() );
    }
}
