package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/13
	Description: This sofware Create a program that asks for two numbers and says if one is a multiple of the other.
	 */
        f_menu();
        f_input_numbers();
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|     SoftMultiplos    |");
        System.out.println("| Version 1.0 20200413 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
    }

    public static boolean f_multiplo(int n1, int n2) {
        //Description; This method determinate if it is multiple
        boolean multiplo = false;
        if (n1 % n2 == 0) {
            multiplo = true;
        }
        return multiplo;
    }

    public static void f_input_numbers() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the first  integer number:");
        int n1 = teclado.nextInt();
        System.out.println("input the second integer number");
        int n2 = teclado.nextInt();
        boolean rpta = f_multiplo(n1, n2);
        if (rpta == true) {
            System.out.println(n1 + " its multiple of " + n2);
        }
        else{
            System.out.println(n1+ " is not multiple of "+n2);
        }
        }
    }

