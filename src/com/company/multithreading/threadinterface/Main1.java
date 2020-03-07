package com.company.multithreading.threadinterface;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadInterfaceExample threadInterfaceExample = new ThreadInterfaceExample();
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                threadInterfaceExample.loop1();
            }
        };

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                threadInterfaceExample.loop2();
            }
        };
        thread1.start();
        thread.start();

    }
}
