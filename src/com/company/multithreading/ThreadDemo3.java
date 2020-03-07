package com.company.multithreading;


class ThreadPract extends Thread {
    void A (Thread t1) {
        for (int i = 0; i<5; i++) {
            try {
                t1.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A..." +i);
        }
    }

    void B (Thread t2) {
        for (int j = 0; j<5; j++) {
            try {
                t2.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B..." +j);
        }
    }

}
public class ThreadDemo3 {

    public  void run () {
        System.out.println("Running...");
    }
    public static void main(String[] args) {

        ThreadPract t1 = new ThreadPract();

        ThreadPract t2 = new ThreadPract();

        t1.A(t1);
        t2.B(t2);

    }
}
