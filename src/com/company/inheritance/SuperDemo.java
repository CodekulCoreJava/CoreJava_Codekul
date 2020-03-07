package com.company.inheritance;

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in int A");
    }
}
class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }


    public B(int i) {
        super(i);
        System.out.println("in int B");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B();

    }
}
