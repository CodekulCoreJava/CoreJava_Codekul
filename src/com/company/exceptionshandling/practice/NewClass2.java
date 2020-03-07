package com.company.exceptionshandling.practice;

import java.util.ArrayList;

// A Common cause index out of bound
public class NewClass2
{
    public static void main(String[] args)
    {
        int ar[] = {1, 2, 3, 4, 5};
        for (int i=0; i<ar.length; i++)
            System.out.println(ar[i]);

        ArrayList<String> numbersList = new ArrayList<>(5);
        numbersList.add(0, "One");
        numbersList.add(1, "Two");
        numbersList.add(2, "Three");

        System.out.println(numbersList.get(3));
    }
}
