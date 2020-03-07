package com.company.encapsulation;

//Encapsulation --> Binding data with methods

class Student {
   private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRollno(3);
        obj.setName("sanket");
        System.out.println(obj.getName() + " " + obj.getRollno());


    }
}
