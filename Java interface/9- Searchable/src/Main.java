/*
9. Write a Java program to create an interface Searchable with a method search(String keyword)
that searches for a given keyword in a text document. Create two classes Document and WebPage
that implement the Searchable interface and provide their own implementations of the search() method.
*/

public class Main {
    public static void main(String[] args) {


        Searchable webpage = new Webpage("hello my name is john smith");
        Searchable document = new Document("hello my name is lionel messi");

        webpage.search("john");
        document.search("MESSI");
    }
}