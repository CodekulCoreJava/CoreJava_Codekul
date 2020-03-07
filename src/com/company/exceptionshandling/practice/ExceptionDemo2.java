package com.company.exceptionshandling.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo2 {

    void saveData(String data) throws IOException {
        File file=new File("/C-Exercise/function20.c");
        FileOutputStream outputStream=new FileOutputStream(file);
        byte[] bytes=data.getBytes();
        outputStream.write(bytes);
        outputStream.close();


    }


    void getData() throws IOException {
        File file=new File("/C-Exercise/function20.c");
        FileInputStream inputStream=new FileInputStream(file);
        int input=0;
        while ((input=inputStream.read())!=-1){
            System.out.print((char)input);
        }
        //throw new ArithmeticException("Arithmetic exception throw zala.");

    }

    void checkArithmaticException(){
        try {
            int a = 10;
            int result = a / 0;
            System.out.println("Result : " + result);



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(restOfTheCode());
    }

    void checkNullPointerException(){
        try {
            String s = null;
            int result = s.length();
            System.out.println("Result : " + result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(restOfTheCode());
        }
    }


    String restOfTheCode(){
        return "REST OF THE CODE";
    }


    public static void main(String[] args) {
        ExceptionDemo2 demo=new ExceptionDemo2();
        //demo.checkNullPointerException();
        Scanner scanner=new Scanner(System.in);
        //  System.out.print("Enter name : ");
        //  String data=scanner.nextLine();
        try {
            //demo.saveData(data);
            demo.getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
