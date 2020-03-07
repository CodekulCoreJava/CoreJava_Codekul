package com.company.exceptionshandling.practice;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            String str=null;
            System.out.println (str.length());
        }

        catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        }
    }
}
