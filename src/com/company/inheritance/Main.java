package com.company.inheritance;

import java.util.Scanner;

public class Main extends Engineering{
    public static final Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String Streams = console.nextLine();
        Engineering obj1 = new Engineering();
        obj1.engineering("Electronics, Civil, Mechanical");
        obj1.science("Physics, Chemistry, Mathematics");
        obj1.stream("Streams : ", console);

        Arts obj2 = new Arts();
        obj2.arts("literature");
        obj1.antennaTheory();
        obj2.digitalElectronics();




    }

}
