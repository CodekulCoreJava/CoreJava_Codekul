package com.company.inheritance;

class Calc {
    public int add (int a, int b) {
        return a+b;
    }
}

class AdvCalc extends Calc {
    public int sub (int a, int b) {
        return a-b;
    }
}
class  VeryAdvCalc extends AdvCalc {
    public int mutli (int a, int b) {
        return a*b;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        System.out.println(obj1.add(5,9));
        System.out.println(obj1.sub(9,3));
        System.out.println(obj1.mutli(5,4));
    }
}
