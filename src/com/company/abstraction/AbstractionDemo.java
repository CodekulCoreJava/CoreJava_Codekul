package com.company.abstraction;

class Pen extends Writer {
public void write () {
    System.out.println("Pen");
}
}

class Pencil extends Writer{
    public void write () {
        System.err.println("Pencil");
    }
}

class Kit {
    public void doSomething (Writer p) {
        p.write();
    }
}

class Writer {
    public void write () {
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {

        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        k.doSomething(p);
        k.doSomething(pc);

    }
}
