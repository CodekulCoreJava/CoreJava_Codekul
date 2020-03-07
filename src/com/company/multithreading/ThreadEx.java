package com.company.multithreading;

public class ThreadEx extends Thread {

    public void run () {
        for (int i =0; i<6; i++) {
            try {
                sleep(700);
                System.out.println("Sanket..." +i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEx threadEx1 = new ThreadEx();
        ThreadEx threadEx2 = new ThreadEx();
        ThreadEx threadEx3 = new ThreadEx();

        threadEx1.start();

        threadEx2.start();

       threadEx1.sleep(500);

        threadEx3.start();

        threadEx1.run();

    }
}
