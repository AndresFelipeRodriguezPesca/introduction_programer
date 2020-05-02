package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/21
	Description:This software
	 */
        f_menu();
        int N= f_number_employers();
        double highest_Salary=0,total_Salary=0, average_Salary=0, salary_employe;
        for (int i=1; i<N; i=i+1){
            salary_employe=f_salary(i);
            total_Salary=total_Salary+salary_employe;
            if (highest_Salary<salary_employe){
                highest_Salary=salary_employe;
            }
        }
        average_Salary=total_Salary/N;
        System.out.println("The total salary is:"+ total_Salary+ " the average salary is "+ average_Salary+" the highest salary is "+ highest_Salary);
    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftSalary         |");
        System.out.println("| Version 1.0 20200421   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }
    public static int f_number_employers(){
        //Description:This method return the numbers of employers
        Scanner keyboard= new Scanner(System.in);
        int employers;
        do {
            System.out.println("input the total employers(input  more than 1 employer)");
            employers=keyboard.nextInt();

        }while (employers<1);
        return employers;
    }
    public static double f_salary(int i){
        //Description: This method return the salary of one employed
        Scanner keyboard= new Scanner(System.in);
        double sueldo, dias_tr, salary;
        do {
            System.out.println("input the wages(the value must be more tan zero):");
            sueldo=keyboard.nextDouble();
        } while (sueldo<1);
        do {
            System.out.println("input the days worked (the value must be between 1 and 30) ");
            dias_tr=keyboard.nextDouble();

        }while (dias_tr<1 ||dias_tr>30);
        salary=(sueldo/30)*dias_tr;
        return salary;
    }

}
