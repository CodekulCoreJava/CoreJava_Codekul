package com.company.collectionsexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListForEachExample {

        public static void main(String[] args) {

            List<String> subject = new ArrayList<>();
            subject.add("Algebra"); subject.add("Mathematics");
            subject.add("Chemistry"); subject.add("Physics");

            Consumer<Object> consumer = new ArrayListForEachExample().new MyConsumer();

            subject.forEach(consumer);

            //lambda style
            subject.forEach(x -> {System.out.println("Processed "+x);});

        }

        class MyConsumer implements Consumer<Object>{

            @Override
            public void accept(Object t) {
                System.out.println("Processing "+t);
            }

        }

}
