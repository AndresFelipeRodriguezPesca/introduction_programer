package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/29
	Description: Carry out a program that asks us for a number n, and tells us how many numbers  there are between 1 and n that are prime.
	 */
        f_menu();
        int number = f_user_number();
        int total_primes = 0;
        for (int i = 1; i <= number; i++) {
            if (f_number_primes(i) == true) {
                total_primes++;
                System.out.println("Number " + i + " prime");
            }
        }
        System.out.println("The total primes is : " + total_primes);
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|     SoftPrimeNumber  |");
        System.out.println("| Version 1.0 20200429 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
    }

    public static int f_user_number() {
        //Description: This method return a number input by the user
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Input a number greater than 1");
        number = keyboard.nextInt();
        while (number <= 1) {
            System.err.println("ERROR: The  number is not greater than 1: please rectify ");
            System.out.println("Input again a number greater than 1");
            number = keyboard.nextInt();
        }
        return number;
    }

    public static boolean f_number_primes(int number) {
        //Description: This method contain the function of n primes
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
