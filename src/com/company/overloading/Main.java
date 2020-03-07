package com.company.overloading;

public class Main {
    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.addition(5, 6);
        obj.addition(4, 8);
        obj.addition(3.2, 4);
        MethodOverloadingExample.Substraction obj1 = new MethodOverloadingExample.Substraction();
        obj1.substraction(6,3);
        MethodOverloadingExample.Multiplication obj2 = new MethodOverloadingExample.Multiplication();
        obj2.multiplication(5,4);

    }
}
