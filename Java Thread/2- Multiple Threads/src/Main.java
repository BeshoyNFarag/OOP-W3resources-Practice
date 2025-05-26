/*
2. Use two threads to print even and odd numbers

Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
*/


public class Main {
    public static void main(String[] args) {

        OddAndEvenThread myOddThread = new OddAndEvenThread();
        OddAndEvenThread myEvenThread = new OddAndEvenThread();

        
        myEvenThread.start();
        myOddThread.start();

        myEvenThread.getEvens();
        myOddThread.getOdds();



    }
}