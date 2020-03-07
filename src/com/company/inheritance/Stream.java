package com.company.inheritance;

import java.util.Scanner;

class Stream implements Electronics{
        void stream ( String Streams, Scanner scanner) {
            System.out.print("Enter Streams : " );

            System.out.println("Streams : " +Streams);
    }

    @Override
    public void digitalElectronics() {
        System.out.println("Digital Electronics");
    }

    @Override
    public void antennaTheory() {
        System.out.println("Antenna Theory");
    }
}

class Science extends Stream {
    void science(String Science) {

        System.out.println("Science stream : " +Science);
    }

}
class Engineering extends Science {
    void engineering (String Engineering) {
        System.out.println("Engineering : " +Engineering);
    }
}

class Commerce extends Stream {

    void commerce(String Commerce) {
        System.out.println("Commerce Stream : " +Commerce);
    }
}

class Arts extends Stream {
    void arts(String Arts) {
        System.out.println("Arts Stream : " +Arts);
    }
}

interface Microcontrollers extends Electronics {

    void microControllers ();
}