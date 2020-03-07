package com.company.abstraction;

class Printer {
    public void show (Number i) {
        System.out.println(i);
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5);

    }
}
