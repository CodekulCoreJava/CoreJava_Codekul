package com.company.multithreading;

public class RunnableInterfaceDemo implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println("Hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableInterfaceDemo demo=new RunnableInterfaceDemo();

        Runnable runnable= () -> {

        };

        Thread thread=new Thread(demo);
        thread.start();
    }
}
