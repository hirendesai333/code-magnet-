package org.example;

public class TestThreads {
    public static void main(String[] args) {
        //instance of thread one and thread two classes
        ThreadOne t1=  new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        //two threads and given both classes instances to each threads
        Thread threadOne = new Thread(t1);
        Thread threadTwo = new Thread(t2);

        //both thread started!!
        threadOne.start();
        threadTwo.start();
    }

}