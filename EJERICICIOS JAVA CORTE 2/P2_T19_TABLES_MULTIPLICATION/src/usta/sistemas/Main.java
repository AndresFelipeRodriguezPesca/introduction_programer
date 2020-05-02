package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/27
	Description: This program that prints the multiplication tables from
	 */
        f_menu();
        int user_number= f_number_user();
        while (user_number!=0) {
            f_generated_multiplication(user_number);
            user_number=f_number_user();


        }
    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("---------------------------------");
        System.out.println("|     SoftMultiplicationTables  |");
        System.out.println("| Version 1.0 20200427          |");
        System.out.println("| Created by: AFRP              |");
        System.out.println("---------------------------------");
    }
    public static int f_number_user(){
        //Description: This method ask for the user what multiply table want and return this number
        Scanner teclado= new Scanner(System.in);

        System.out.println("input the multiply table that you want");
        int user_num= teclado.nextInt();

        while (user_num <0 ||  user_num> 99){
            System.err.println("ERROR: You only have the multiply tales between the 0 and 99");
            System.out.println("Input again the multiply table that you want(0 to exit)");
        }
        return user_num;
    }
    public static void f_generated_multiplication (int number_user){
        //Description: This method with  a for show the multiplication  tables
        System.out.println("The multiplication table is");
        for (int i=1; i<=10; i++){
            System.out.println(number_user+" X "+ i + " = " + number_user*i);
        }
    }

}
