package com.company.multithreading;

class ThreadExx extends Thread {

    void Z () {
        for (int i = 0; i<5; i++) {
            System.out.println("Z..." +i);
        }
    }
}
public class SynchronizationExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();
    }
}
