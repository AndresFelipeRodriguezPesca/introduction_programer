package usta.sistemas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/04
	Description:Saves the salaries of 5 employees using an arrangement (vector), where the salaries are a random value between $ 1,000,000 and $ 2,000,000, use a function to calculate the salary and save it in the vector
	 */
        f_menu();
        int[] salary_of_employees = f_sueldos();
        f_show_sueldos(salary_of_employees);
    }

    public static void f_menu() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftVectorSalary     ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-04        ║");
        System.out.println("╚══════════════════════════╝");
    }

    public static int[] f_sueldos() {
        //Description: This method returns a vector with salary of five employees
        Random rand = new Random();
        int[] salary = new int[5];
        for (int i = 0; i < 5; i++) {
            salary[i] = (int) Math.floor(Math.random() * ((2000000 - 100000 + 1) + 1000000));

        }
        return salary;
    }

    public static void f_show_sueldos(int[] salary) {
        //Description: This method show the vector with the salary
        System.out.println("-----The list of salary is-------");
        for (int i = 0; i < 5; i++) {
            System.out.println("The salary of (" + i + ") is :" + salary[i]);
        }
    }

    }
