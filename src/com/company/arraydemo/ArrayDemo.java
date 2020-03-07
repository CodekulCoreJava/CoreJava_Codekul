package com.company.arraydemo;

class Student {
    int roll_no;
    String name;

}

public class ArrayDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student s[] = new Student[5];
        Student std[] = {s1,s2, s3};

        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = {9,10,11,12};

        int d[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int t[][] = {
                {1,2,3,4},
                {5,6,},
                {9,10, 55 ,11,12}
        };

        for (int i=0; i<3; i++){
            for (int j =0; j<4; j++){
                System.out.print(" "+ d[i][j]);
            }
            System.out.println();
        }

        //Jagged Array
        for (int i=0; i<t.length; i++){
            for (int j =0; j<t[i].length; j++){
                System.out.print(" "+ t[i][j]);
            }
            System.out.println();
        }

        for (int k : a) {
            System.out.print(a);
        }

        for (int l[] : t){
            for (int f : l) {
                System.out.print(" " +l);
            }
            System.out.println();
        }
    }
}
