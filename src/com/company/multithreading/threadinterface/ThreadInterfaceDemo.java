package com.company.multithreading.threadinterface;

public class ThreadInterfaceDemo implements Runnable
{
    void firstLoop(){
        for (int i = 0; i<5; i++) {

            System.out.println("First Loop" + i);
        }

    }
    void secondLoop(){
        for (int j = 0; j<5; j++) {
            System.out.println("Second Loop" +j);
        }

    }

    @Override
    public void run() {

    }
}
