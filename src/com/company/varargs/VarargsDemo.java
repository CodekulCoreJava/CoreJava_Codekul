package com.company.varargs;

class Calculator {
    public int add (int ... n){
        int sum=0;
        for (int i : n) {
            sum = sum+i;
        }
        return sum;
    }
}
public class VarargsDemo {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(4,5,6,9,5,3,4,8,9));
    }
}
