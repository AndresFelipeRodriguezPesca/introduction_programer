package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/29
	Description:Read 5 numbers and show them in reverse order to the one entered.
	 */
        f_menu();
        f_number_user();
    }

        public static void f_menu() {
            //Description: This method show the menu of this software
            System.out.println("------------------------");
            System.out.println("|     SoftNumbers      |");
            System.out.println("| Version 1.0 20200429 |");
            System.out.println("| Created by: AFRP     |");
            System.out.println("------------------------");
        }
        public static void f_number_user(){
        //Description: This method return the number by the user
            Scanner keyboard= new Scanner(System.in);
            int number1, number2, number3, number4, number5;
            double average;
            System.out.println("Input the number 1");
            number1=keyboard.nextInt();
            System.out.println("input the second number ");
            number2=keyboard.nextInt();
            System.out.println("input the third number");
            number3=keyboard.nextInt();
            System.out.println("Input the fourth number");
            number4=keyboard.nextInt();
            System.out.println("Input the fifth number");
            number5=keyboard.nextInt();
            System.out.println("The inverted numbers are:"+ number5+ " , "+number4+ " , " +number3+" , "+number2+" , "+number1);
            average=number1+number2+number3+number4+number5/5;
            System.out.println("The average of the number is:"+ average);

        }
}
