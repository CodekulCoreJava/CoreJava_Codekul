package com.company.exceptionshandling;

import java.util.Scanner;

public class ExceptionDemo {
        public static void main(String[] args) {
            Scanner inputDevice = new Scanner((System.in));
            System.out.print("Enter first number (numerator): ");
            int numerator = inputDevice.nextInt();
            System.out.print("Enter second number (denominator): ");
            int denominator = inputDevice.nextInt();
            try {
                new ExceptionDemo().doDivide(numerator, denominator);
            } catch (Exception e) {
                System.out.println("Exception condition program is ending");
            }
        }

        private void doDivide ( int a, int b) throws Exception {
            float result = a / b;
            System.out.println("Division result of" + a + "/" + b + "=" + result);
        }
    }
