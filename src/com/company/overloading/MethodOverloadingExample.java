package com.company.overloading;

public class MethodOverloadingExample {


    int result;

    static class Substraction {
        static void substraction (int a, int b) {
            int result = a - b;
            System.out.println(result);
        }

    }

   static class Multiplication {
        void multiplication (int a, int b) {
            int c;
            System.out.println(c = a*b);

        }
    }


    void addition (int a, int b) {
        System.out.println(result = a+b);
    }


    void addition(double num1, int num2) {
        double res = num1 + num2;
        System.out.println(res);
    }

}
