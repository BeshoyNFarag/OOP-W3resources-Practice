/*

Write a Java program to create a class called "ComplexInitializer" with a static block that
initializes multiple static variables (x, y, z) using complex logic. Print the values of these
variables in the main method.
*/


public class ComplexIntializer {


    static {
        int x = 20;
        int y = 30;
        int z = calculateZ(x,y);


        System.out.println(x + " " + y+ " " + z+ " ");


    }

    public static int calculateZ(int x, int y){
        return (x*y) + (x+y) ;
    }
}
