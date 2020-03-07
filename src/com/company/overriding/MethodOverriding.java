package com.company.overriding;
/**
 * Method overriding -
 * child class method will override Parent class method */

class A {
    public void Show () {
        System.out.println("in A");
    }

}
class B extends A {
    @Override
    public void Show() {
        super.Show();
    }

    public void Show1 () {
        System.out.println("in B");
    }


}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.Show();

    }
}
