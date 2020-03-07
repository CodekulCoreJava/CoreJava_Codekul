package com.company.abstraction;


public class CheckAbstraction extends AbstractClass implements InterfaceDemo {
    @Override
    public String setName() {
        return "Codekul";
    }


    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.setName();
        abstraction.getName();
    }

    @Override
    public void showData() {
    }

}
