/*
2. Use two threads to print even and odd numbers

Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
*/


class OddAndEvenThread extends Thread{



    @Override
    public void run(){
        System.out.println("Thread Started!");
    }


    public void getEvens(){
        OddAndEvenThread.currentThread().setName("Even");
        for(int i= 0; i <= 20; i++){
            if(i % 2 == 0 || i == 0){
                System.out.println(i + " from thread " + OddAndEvenThread.currentThread().getName());
            }
        }
    }


    public void getOdds(){
        OddAndEvenThread.currentThread().setName("Odd");

        for(int i= 0; i <= 20; i++){
            if(i % 3 == 0 || i == 1 && i != 6){
                System.out.println(i + " from thread " + OddAndEvenThread.currentThread().getName());
            }
        }
    }
}
