package com.company.exceptionshandling;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) throws MyException {
        int num;

        Scanner Sc = new Scanner(System.in);

        System.out.print("\n\tEnter any number : ");
        num = Integer.parseInt(Sc.nextLine());

        try
        {
            if(num%2 != 0)
                throw new MyException();    // Statement 2
            else
                System.out.print("\n\t" + num + " is an even number");
        }
        catch(MyException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program");
    }
}