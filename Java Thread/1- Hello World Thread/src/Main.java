/*
1. Create a thread that prints "Hello, World!"

Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
*/


public class Main {
    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.setName("Greetings Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        System.out.println(thread.isAlive());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
    }
}