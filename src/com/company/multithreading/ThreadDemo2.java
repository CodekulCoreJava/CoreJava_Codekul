package com.company.multithreading;

class ThreadPractice extends  Thread {
    void A (Thread t1) {
        for (int i = 0; i<5; i++) {
            try {
                t1.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A...");
        }
    }

    void B (Thread t2) {
        for (int j = 0; j<5; j++) {
            try {
                t2.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B...");
        }
    }

}
public class ThreadDemo2 extends  Thread{

    public static void main(String[] args) {

        ThreadPractice threadPractice = new ThreadPractice();

        Thread t1 = new Thread(threadPractice);
        Thread t2 = new Thread();

        t1.start();
            threadPractice.A(t1);

        t2.start();
            threadPractice.B(t2);
    }
}
