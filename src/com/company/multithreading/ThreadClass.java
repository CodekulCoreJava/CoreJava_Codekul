package com.company.multithreading;

public class ThreadClass extends ThreadWithMethods{

    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(600);
                System.out.println("Hi " +i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadClass threadClass1=new ThreadClass();
        ThreadClass threadClass2=new ThreadClass();
        threadClass1.start();
        threadClass2.start();

        threadClass1.join();
        threadClass2.join();
        threadClass1.run();

    }
}
