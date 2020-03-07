package com.company.generic;

public class GenericClassExample <T> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     static <T> void displayData (T element) {
         System.out.println("Name : " + element.getClass().getName() + " = " + element);
    }

}
