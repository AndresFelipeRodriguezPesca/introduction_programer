package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/22
	Description: This software Read from the keyboard a series of numbers until you get one lower than 100,
	in the end determine the sum and average of the numbers entered
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int total_number = 0;
        double sumatory = 0, average = 0, number;
        System.out.println("Input a number ");
        number = keyboard.nextDouble();
        while (number > 100) {
            sumatory = sumatory + number;
            total_number += 1; // es igual a total_number=total_number+ number
            System.out.println("Input other number ");
            number = keyboard.nextDouble();
        }
        if (total_number!=0){
            average=sumatory/total_number;
        }
        System.out.println("The summatory of " + total_number+ " is " + sumatory+ " and average "+ average);
    }


    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|     SoftLess1000v    |");
        System.out.println("| Version 1.0 20200422 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
    }
}
