/*
Write a Java program to create an outer class called Library with an instance variable libraryName.
Create an inner class Book with a method getLibraryName() that returns the name of the library.
Instantiate the Book class and call the getLibraryName() method.
*/


public class Library {


    private final String  libraryName = "Goethe";

    class Book{
        public String getLibraryName(){
            return libraryName;
        }
    }
}
