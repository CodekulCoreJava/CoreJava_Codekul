package com.company;

import java.util.Scanner;

public class Employees {

    String name;
    String designation;
    double salary;
    int experience;

    Scanner scanner = new Scanner(System.in);

    public void getDetails () {

        System.out.println("--- Enter the details of Employees --- \n");

        System.out.println("Enter employee's name : ");
        name = scanner.nextLine();

        System.out.println("Enter employees designation : ");
        designation = scanner.nextLine();

        System.out.println("Enter employees salary : ");
        salary = scanner.nextDouble();

        System.out.println("Enter employees experience : ");
        experience = scanner.nextInt();

    }

    public void showDetails () {

        System.out.println("--- The Details of employees ---\n ");

        System.out.println("Name : " +name);

        System.out.println("Designation : " +designation);

        System.out.println("Salary : " +salary);

        System.out.println("Experience : " +experience);

    }

    public void hike () {
        if (experience == 0) {
            salary = salary;
        }
        else if (experience != 0) {

            if (experience <= 3) {
                salary += salary * 0.15;
            }
            else if (experience <= 5) {
                salary += salary * 0.30;
            }
            else if (experience <= 10) {
                salary += salary * 0.50;
            }
            else if (experience <= 15) {
                salary += salary * 0.60;
            }
            else {
                salary += salary * 0.05;
            }
        }
    }

}
