package com.company.multithreading;

public class MultiThreadDemo extends Thread {

    void A(Thread thread)  {
        thread.start();
        for(int i=0; i<5; i++) {
            System.out.println("Thread A");
        }



    }

    public static void main(String[] args) {

        MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
        multiThreadDemo.start();
        multiThreadDemo.A(new Thread());
    }
}
