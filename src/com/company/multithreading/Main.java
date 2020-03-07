package com.company.multithreading;

public class Main extends  Thread {

    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        main.start();
        Thread thread1 = new Thread();
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi..Thread 1");
            }
        }

        thread1.sleep(500);

        Thread thread2 = new Thread();

        {
            for (int j = 0; j < 3; j++) {
                System.out.println("Hello...Thread 2");
                //thread2.sleep(500);
            }
        }

        thread2.start();
    }

}
