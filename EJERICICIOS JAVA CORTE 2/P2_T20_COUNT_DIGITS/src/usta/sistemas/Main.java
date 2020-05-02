package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez pesca
	Date: 28/03/2020
	Description: This program
	 */
        f_menu();
        int total_digits=0;
        int number = f_number_user();
        if (number!=0){
            while (number != 0) {
                number = number / 10;
                total_digits++;
            }

            }else{ total_digits=1;}
        System.out.println("The total digits of the number "+ total_digits);

    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("---------------------------------");
        System.out.println("|     SoftCountDigits           |");
        System.out.println("| Version 1.0 20200428          |");
        System.out.println("| Created by: AFRP              |");
        System.out.println("---------------------------------");
    }

    public static int f_number_user() {
        //Description: This method return the  number input by the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the any number ");
        int number = keyboard.nextInt();
        return number;

    }
}

