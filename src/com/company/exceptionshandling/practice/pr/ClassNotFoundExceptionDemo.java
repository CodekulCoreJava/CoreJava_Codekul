package com.company.exceptionshandling.practice.pr;

public class ClassNotFoundExceptionDemo {

        private static final String CLASS_TO_LOAD = "main.java";

        public static void main(String[] args) {
            try {
                Class loadClass = Class.forName(CLASS_TO_LOAD);
                System.out.println("Class " + loadClass + " found successfully!");
            }
            catch (ClassNotFoundException ex) {
                System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());
                ex.printStackTrace();
            }
        }

}
