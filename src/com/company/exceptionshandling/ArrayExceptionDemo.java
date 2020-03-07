package com.company.exceptionshandling;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int array[] = {10,20,3,0,30,40,50,60};

        try {
            for(int i = 0; i <= array.length; i--) {
                System.out.println("The value of array is : " +array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of Bounds"+e);
        } catch (ArithmeticException e) {
            System.out.println ("Can't divide by Zero"+e);
        }
    }
}
