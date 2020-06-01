package usta.sistemas;

import java.util.Scanner;

public class Main {
    private static int total_employes;
    public static int[][] matrix_salary = new int[total_employes][12];
    public static int[] total_salary = new int[12];
    public static int[] total_empl = new int[12];
    public static String[] vector_mes = {"January", "february", "march", "april", "may", "june", "july", "august", "september",
            "october", "november", "december"};
    public static int best=0;
    public static int salary_column=0;

    public static void main(String[] args) {
        // write your code here
      /*  AUTHOR: Andres Felipe Rodriguez
      DATE: 26/04/2020
      DESCRIPTION: This software calculate the salary of employees
       */
        f_menu();
        f_matrix();
        f_total_Salary();
        for (int i = 0; i < total_salary.length; i++) {
            for (int j = 0; j < total_empl.length; i++) {
                System.out.println("The mes  " + vector_mes[i] + " total salary " + total_salary[i] + " total employed is:" + total_salary[j]);
            }
        }
        f_show_best_salary();
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        Scanner keyboard = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("|  SoftSalaryEmployed    |");
        System.out.println("| Version 1.0 20200526   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
        int employees;
        System.out.println("Input the amount of employees ");
        employees = keyboard.nextInt();
        while (employees < 0) {
            System.err.println("ERROR: The employed not exist");
            System.out.println("Input again the amount of employed");
            employees = keyboard.nextInt();
        }
    }

        public static void f_matrix () {
            //Description: This method calculate the salary of employees
            for (int i = 0; i < matrix_salary.length; i++) {
                for (int j = 0; j < matrix_salary[0].length; j++) {
                    matrix_salary[i][j] = (int) Math.floor((Math.random() * (4389015 - 877803) + 877803));

                }
            }
        }
        public static void f_total_Salary () {
            for (int j = 0; j <matrix_salary[0].length; j++) {
                for (int i = 0; i <matrix_salary.length; i++) {
                    total_salary[j] += matrix_salary[i][j];

                }
            }
        }
        public static void f_show_best_salary(){
        best=total_salary[0];
        for (int m=0; m<total_salary.length;m++){
            if (best<total_salary[m])
                best=total_salary[m];
            salary_column=m;
            System.out.println("The best salary is: "+ vector_mes[salary_column]+ "total salary is: "+ total_salary[salary_column]) ;
        }
        }
    }