/*
7. Write a Java program to create an interface Sortable with a method sort() that sorts an array
of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the
Sortable interface and provide their own implementations of the sort() method
*/

public class Main {
    public static void main(String[] args) {

        Sortable bubblesort = new BubbleSort();
        Sortable selectionsort = new SelectionSort();

        int [] testArr = {1,3,5,2,7,10};
        bubblesort.sort(testArr);
        System.out.println();
        selectionsort.sort(testArr);



    }
}