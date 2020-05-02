package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/16
	Description:
	 */
        f_menu();
        int option = f_option();
        while (option != 0) {
            if (option == 1) {
                f_convert_pesos_to_dollars();
            } else if (option == 2) {
                f_convert_pesos_to_euros();
            } else  if (option==3){
                f_convert_euros_to_dollars();

            }
            option=f_option();

        }

    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftConvertMoney   |");
        System.out.println("| Version 1.0 20200416   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }

    public static int f_option() {
        //Description: This method return the option
        System.out.println("Input of the  option of the convert : \n1 - pesos to dollars\n2 -pesos to euros\n3 -euros to dollars\n0- to exit");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERR: This option doesn't exist");
            System.out.println("Input of the  option of the convert : \n1 -pesos to dollars\n2 -pesos to euros\n3 - euros to dollars");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_convert_pesos_to_dollars() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the amount money in pesos");
        int pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("ERR: Lower to 1000 not convert ");
            System.out.println("input the again the amount money in (pesos)");
            pesos = keyboard.nextInt();
        }
        double dollars = pesos * 3937;
        System.out.println("The dollars is " + dollars);

    }

    public static void f_convert_pesos_to_euros() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the amount money in pesos");
        int pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("ERR: Lower to 1000 not convert ");
            System.out.println("input the again the amount money in (pesos)");
            pesos = keyboard.nextInt();
        }
        double euros = pesos * 4269;
        System.out.println("The dollars is " + euros);

    }

    public static void f_convert_euros_to_dollars() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the amount money in pesos");
        int euros = keyboard.nextInt();
        while (euros < 10) {
            System.err.println("ERR: Lower to 1000 not convert ");
            System.out.println("input the again the amount money in (pesos)");
            euros = keyboard.nextInt();
        }
        double dollars = euros * 0.92;
        System.out.println("The dollars is " + dollars);
    }
}
