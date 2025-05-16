/*
2. Static Methods:
Write a Java program to create a class called "MathUtility" with a static method add
that takes two integers and returns their sum. Demonstrate the usage of this static
method in the main method without creating an instance of "MathUtility".
*/



public class MathUtility {

    private static double sum;


    public static void add(double num1, double num2) {
        sum = num1 + num2;

    }

    public static void getSum(){
        System.out.println("Sum = " + sum);
    }

}
