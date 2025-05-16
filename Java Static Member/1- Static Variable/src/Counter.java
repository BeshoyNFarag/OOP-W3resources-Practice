/*
1. Static Variables:
Write a Java program to create a class called "Counter" with a static variable count.
Implement a constructor that increments count every time an object is created.
Print the value of count after creating several objects.
*/



public class Counter {
    private static int counter;

    public Counter() {
        System.out.println("Object created");
        counter ++;
    }

    public static void getCounter(){
        System.out.println(counter);
    }


}
