package com.company.wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i);    //Boxing/Wrapping  Wrapper class

     //   int j = ii.intValue();      //unboxing/unwrapping

        Integer value = i;      //Auto-wrapping/Auto-Boxing

        int k = value;

    }
}
