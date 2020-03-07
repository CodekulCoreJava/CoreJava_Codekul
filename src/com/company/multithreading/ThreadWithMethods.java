package com.company.multithreading;

public class ThreadWithMethods extends Thread {


    void A(Thread thread1) throws InterruptedException {
        thread1.start();
        for (int i = 0; i<5; i++) {
            thread1.sleep(800);
            System.out.println("Method A thread " +i);
        }
    }

    void B(Thread thread2) {
        thread2.start();
        for (int j = 0; j<5; j++) {
            System.out.println("Method B thread " +j);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadWithMethods threadWithMethods = new ThreadWithMethods();
        threadWithMethods.A(new Thread());
        threadWithMethods.start();
        threadWithMethods.B(new Thread());
    }

}
