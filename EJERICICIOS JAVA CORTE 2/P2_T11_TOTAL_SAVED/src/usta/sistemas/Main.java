package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/21
	Description: This software determines the total save per person in N months
     */
        Scanner keyboard= new Scanner(System.in);
        f_menu();
        int N=f_total_months();
        int total_saved=0, average_saved=0, money_saved;
        for (int i=1; i<=N;i=1+1){
            do {
                System.out.println("input the money the" + i + "month ( the value must be greater than zero)");
                money_saved = keyboard.nextInt();
            }while (money_saved<0);
                total_saved=total_saved+money_saved;
            }
            average_saved=average_saved/N;
            System.out.println("the total saved money is "+ total_saved+"and the average is "+ average_saved);
        }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftSaveMoney      |");
        System.out.println("| Version 1.0 20200421   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }
    public static int f_total_months(){
        //Description: This method return the total months

        Scanner keyboard= new Scanner(System.in);
        int N_months;
        do {
            System.out.println("input the total months the value must be greater than zero ");
            N_months=keyboard.nextInt();
        } while (N_months<1);
        return N_months;
        }
    }
