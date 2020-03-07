package com.company.multithreading.threadinterface;

public class Main {

    public static void main(String[] args){
        ThreadInterfaceDemo threadInterfaceDemo = new ThreadInterfaceDemo();
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                threadInterfaceDemo.firstLoop();
            }
        };

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                threadInterfaceDemo.secondLoop();
            }
        };
        thread.start();
        thread1.start();
    }
}
