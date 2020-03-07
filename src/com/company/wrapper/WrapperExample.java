package com.company.wrapper;

public class WrapperExample {

    public static void main(String[] args) {
        int num = 100;
        String number = null;
        char ch = 'a';

        Integer obj = Integer.valueOf(num);
        System.out.println(num + " " + obj);

        Character a = ch;
        Character obj1 = Character.toLowerCase(ch);

        String obj3 = new String(number);
        System.out.println(ch + " " + a);


    }
}
