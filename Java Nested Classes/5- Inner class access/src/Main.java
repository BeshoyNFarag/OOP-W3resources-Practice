/*
Write a Java program to create an outer class called Library with an instance variable libraryName.
Create an inner class Book with a method getLibraryName() that returns the name of the library.
Instantiate the Book class and call the getLibraryName() method.
*/

public class Main {
    public static void main(String[] args) {


        Library lib = new Library();
        Library.Book book = lib.new Book();

        System.out.println(book.getLibraryName());

    }
}