package inner_class;

/**
Inner class -
Member Class
Static class
Anonymous class

* */

class Outer {
    public void show () {
        System.out.println("in Outer class");
    }

    class Inner {
        public void diplay () {
            System.out.println("in inner class");
        }
    }

    static class InnerStatic {
        public void disp() {
            System.out.println("in static inner class");
        }
    }
}

public class Innerdemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.diplay();

        Outer.InnerStatic obj2 = new Outer.InnerStatic();
        obj2.disp();

    }
}
