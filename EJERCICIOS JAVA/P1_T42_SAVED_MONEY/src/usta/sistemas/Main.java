package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	/* AUTHOR: Andres Felipe Rodriguez
	DATE: 1/04/2020
	DESCRIPTION: This software Run a program that determines how much money a person saves in a year
	 */
        Scanner keyboard= new Scanner(System.in);
        f_menu();
        System.out.println("input your salary ");
        int salary= keyboard.nextInt();
        f_savad_money(salary);
    }
    public static void f_menu() {
        //Description: show the menú
        System.out.println("......................");
        System.out.println("    SoftSaveMoney     ");
        System.out.println(" Version 1.0 -- 2020 ap - 01 ");
        System.out.println(" Maker: Felipe rodriguez ");
    }
    public static void f_savad_money (int p_salary){
        //Description:this metod/function  calculates the total saved money in a year
        double saved_money=( ( p_salary*0.15)*4)*12;
        System.out.println("the total saved money in a year is "+ saved_money);
    }

}
